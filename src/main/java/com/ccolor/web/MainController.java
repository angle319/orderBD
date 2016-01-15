package com.ccolor.web;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@Controller
public class MainController {
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String menu(WebRequest webRequest,Locale locale, Model model) {
			return "component/menu";
	}
	@RequestMapping(value = "/dialog", method = RequestMethod.GET)
	public String dialog(WebRequest webRequest,Locale locale, Model model) {
			return "component/dialog";
	}
	
}
