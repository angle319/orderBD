package com.ccolor.web;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;


import com.ccolor.mybatis.bean.tblOrderBD_resak;
import com.ccolor.mybatis.service.tblOrderBD_priceService;
import com.ccolor.mybatis.service.tblOrderBD_resakService;

@Controller
public class UserController {
	@Autowired 
	tblOrderBD_resakService user;
	@Autowired 
	tblOrderBD_priceService type;
	@RequestMapping(value = "/setUser", method = RequestMethod.GET)
	public String setUser(WebRequest webRequest,Locale locale, Model model) {
		List list=user.selectResak();
		List list_=user.selectData();
		List price=type.selectData();
		model.addAttribute("resak", list);
		model.addAttribute("data", list_);
		model.addAttribute("price", price);
		return "s_user";
	}
	@RequestMapping(value = "/setUser/add", method = RequestMethod.POST)
	public @ResponseBody String addUser(WebRequest webRequest,Locale locale, Model model) {
		tblOrderBD_resak bean=new tblOrderBD_resak();
		bean.setWorkerid(webRequest.getParameter("id"));
		bean.setName(webRequest.getParameter("name"));
		bean.setType(webRequest.getParameter("type"));
		try{
			if(dataCheck(bean))return "error";
			user.add(bean);
			return "ok";
		}catch(Exception e){
			return "fail";
		}
	}
	@RequestMapping(value = "/setUser/update", method = RequestMethod.POST)
	public @ResponseBody String updateUser(WebRequest webRequest,Locale locale, Model model) {
		tblOrderBD_resak bean=new tblOrderBD_resak();
		bean.setWorkerid(webRequest.getParameter("id"));
		bean.setName(webRequest.getParameter("name"));
		bean.setType(webRequest.getParameter("type"));
		try{
			if(dataCheck(bean))return "error";
			user.update(bean);
			return "ok";
		}catch(Exception e){
			return "fail";
		}
	}
	@RequestMapping(value = "/checkUser", method = RequestMethod.POST)
	public @ResponseBody String checkUser(WebRequest webRequest,Locale locale, Model model) {
		if(user.haveData(webRequest.getParameter("id")))return "ok";
		return "fail";
	}
	public boolean dataCheck(tblOrderBD_resak bean){
		if("".equals(bean.getWorkerid())||"".equals(bean.getName())||"".equals(bean.getType()))return true;
		return false;
	}
}
