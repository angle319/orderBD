package com.ccolor.web.bd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.ccolor.mybatis.bean.tblOrderBD;
import com.ccolor.mybatis.service.tblOrderBDService;

@Controller
public class LogController {
	@Autowired
	tblOrderBDService bd;
	SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
	@RequestMapping(value = "/searchToday", method = RequestMethod.GET)
	public String setType(WebRequest webRequest, Locale locale, Model model) {
		Calendar c = Calendar.getInstance();  
		String s_time=sdFormat.format(c.getTime());
		List<tblOrderBD> list = null;
		try {
			list = bd.selectData(sdFormat.parse(s_time) , sdFormat.parse(s_time+" 23:59:59"));
			for(tblOrderBD obj:list){
				obj.setTemp1(sdFormat.format(obj.getDate()));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		model.addAttribute("data", list);
		return "orderBD/s_today";
	}
}
