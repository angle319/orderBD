package com.ccolor.web.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.ccolor.mybatis.service.tblOrderBDService;
@Component
public class WebTask {
	@Autowired
	tblOrderBDService bd;
	SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
	static Logger log = Logger.getLogger(WebTask.class.getName());
	@Scheduled(cron = "0 0 22,23 * * ?")
	public void setBDPrice() {
		log.info("task: start update price");
		bd.updateTodayPrice();
		log.info("task: end update price");
	}
}
