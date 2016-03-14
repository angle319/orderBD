package com.ccolor.web.account;

import java.text.SimpleDateFormat;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ccolor.mybatis.service.tblOrderBDService;

@Controller
public class AccountControl {
	@Autowired
	tblOrderBDService bd;
	SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String load(Locale locale, Model model) {
		return null;
	}
}
