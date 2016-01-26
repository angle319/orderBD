package com.ccolor.web;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.ccolor.mybatis.bean.tblOrderBD_price;
import com.ccolor.mybatis.bean.tblOrderBD_resak;
import com.ccolor.mybatis.service.tblOrderBD_priceService;

@Controller
public class TypeController {
	@Autowired
	tblOrderBD_priceService type;
	
	@RequestMapping(value = "/setType", method = RequestMethod.GET)
	public String setType(WebRequest webRequest, Locale locale, Model model) {
		List price = type.selectData();
		model.addAttribute("price", price);
		return "s_type";
	}

	@RequestMapping(value = "/checkType", method = RequestMethod.POST)
	public @ResponseBody String checkType(WebRequest webRequest, Locale locale, Model model) {
		if (type.haveData(webRequest.getParameter("id")))
			return "ok";
		return "fail";
	}

	@RequestMapping(value = "/setType/add", method = RequestMethod.POST)
	public @ResponseBody String addUser(WebRequest webRequest, Locale locale, Model model) {
		try {
			tblOrderBD_price bean = new tblOrderBD_price();
			bean.setType(webRequest.getParameter("id"));
			bean.setcSelf(Integer.parseInt(webRequest.getParameter("self")));
			bean.setcCom(Integer.parseInt(webRequest.getParameter("company")));
			bean.setSelf(Integer.parseInt(webRequest.getParameter("person")));
			bean.setsCom(Integer.parseInt(webRequest.getParameter("com_cost")));
			if (dataCheck(bean))
				return "error";
			type.add(bean);
			return "ok";
		} catch (Exception e) {
			return "fail";
		}
	}

	@RequestMapping(value = "/setType/update", method = RequestMethod.POST)
	public @ResponseBody String updateUser(WebRequest webRequest, Locale locale, Model model) {

		try {
			tblOrderBD_price bean = new tblOrderBD_price();
			bean.setType(webRequest.getParameter("id"));
			bean.setcSelf(Integer.parseInt(webRequest.getParameter("self")));
			bean.setcCom(Integer.parseInt(webRequest.getParameter("company")));
			bean.setSelf(Integer.parseInt(webRequest.getParameter("person")));
			bean.setsCom(Integer.parseInt(webRequest.getParameter("com_cost")));
			if (dataCheck(bean))
				return "error";
			type.update(bean);
			return "ok";
		} catch (Exception e) {
			return "fail";
		}
	}

	public boolean dataCheck(tblOrderBD_price bean) {
		if ("".equals(bean.getType()))
			return true;
		return false;
	}
}
