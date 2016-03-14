package com.ccolor.web.bd;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test {
	public static void main(String[] args) {
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar c = Calendar.getInstance();  
		if(c.getTime().getHours()>9){
			c.add(Calendar.DAY_OF_MONTH, 1);
			sdFormat.format(c.getTime());
		}
		System.out.println(sdFormat.format(c.getTime()));
		c.add(Calendar.MONTH, 1);
		System.out.println(sdFormat.format(c.getTime()));
	}
}
