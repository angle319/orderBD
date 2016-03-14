package com.ccolor.web.bd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.ccolor.mybatis.bean.OrderBD;
import com.ccolor.mybatis.service.tblOrderBDService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BDController {
	@Autowired
	tblOrderBDService bd;
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	@RequestMapping(value = "orderBD/{uid}/{name}", method = RequestMethod.GET)
	public String home(@PathVariable("uid") String uid,@PathVariable("name") String name,Locale locale, Model model) {
		uid=bd.selectResak(uid, name);
		boolean mid=true;
		String mark_date="";//
		if(!"".equals(uid)){
			Calendar c = Calendar.getInstance();  
			if(c.getTime().getHours()>9){
				mid=false;
			}
			if(c.getTime().getHours()>15){
				c.add(Calendar.DAY_OF_MONTH, 1);
				mid=true;
			}
			if(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY&&c.getTime().getHours()>15){
				Calendar temp_c=Calendar.getInstance();
				temp_c.add(Calendar.DAY_OF_MONTH, 1);
				mark_date=sdFormat.format(temp_c.getTime());
				temp_c.add(Calendar.DAY_OF_MONTH, 1);
				mark_date=mark_date+","+sdFormat.format(temp_c.getTime());
			}
			if(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
				Calendar temp_c=Calendar.getInstance();
				mark_date=sdFormat.format(temp_c.getTime());
				temp_c.add(Calendar.DAY_OF_MONTH, 1);
				mark_date=mark_date+","+sdFormat.format(temp_c.getTime());
			}
			if(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
				Calendar temp_c=Calendar.getInstance();
				mark_date=sdFormat.format(temp_c.getTime());
			}
			String s_time=sdFormat.format(c.getTime());
			c.add(Calendar.MONTH, 1);
			String e_time=sdFormat.format(c.getTime());
			Gson gson = new Gson();
			String json=null;
			try {
				json = gson.toJson(bd.selectData(uid, name, sdFormat.parse(s_time), sdFormat.parse(e_time)));
			} catch (ParseException e) {
				json = gson.toJson(null);
				e.printStackTrace();
			} finally {
				model.addAttribute("sdate", s_time);
				model.addAttribute("edate", e_time);
				model.addAttribute("defData", json);
				model.addAttribute("mid", mid);
				model.addAttribute("mark_d", mark_date);
				model.addAttribute("uid", uid);
				model.addAttribute("name", name);
			}
			return "orderBD/OrderBD";
		}
		return "error";
	}
	@RequestMapping(value = "/orderBD/save", method = RequestMethod.POST)
	public @ResponseBody String saveData(WebRequest webRequest,Locale locale, Model model) {
		String s_time=webRequest.getParameter("s_time");
		String e_time=webRequest.getParameter("e_time");
		String uid=webRequest.getParameter("uid");
		String name=webRequest.getParameter("name");
		Calendar c = Calendar.getInstance();  
		/*if(c.getTime().getHours()>9){
			c.add(Calendar.DAY_OF_MONTH, 1);
		}*/
		if(s_time.equals(sdFormat.format(c.getTime()))){
			String str=webRequest.getParameter("json");
			Gson gson = new Gson();
			ArrayList<OrderBD> list=gson.fromJson(str, new TypeToken<ArrayList<OrderBD>>(){}.getType());
			try {
				bd.saveData(uid, name, list, sdFormat.parse(s_time), sdFormat.parse(e_time));
			} catch (ParseException e) {
				e.printStackTrace();
				return "false";
			}
			return "true";
		}else{
			return "false";
		}
	}
}
