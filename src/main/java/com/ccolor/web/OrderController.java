package com.ccolor.web;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.ccolor.mybatis.service.tblOrderBD_priceService;
import com.ccolor.mybatis.service.tblOrderBD_resakService;

@Controller
public class OrderController {
	@Autowired 
	tblOrderBD_resakService user;
	@Autowired 
	tblOrderBD_priceService type;
	@RequestMapping(value = "/Order", method = RequestMethod.GET)
	public String setOrder(WebRequest webRequest,Locale locale, Model model) {
		List list=user.selectResak();
		List list_=user.selectData();
		model.addAttribute("resak", list);
		model.addAttribute("data", list_);
		return "s_order";
	}
}
