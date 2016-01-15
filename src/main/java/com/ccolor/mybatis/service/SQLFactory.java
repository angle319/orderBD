package com.ccolor.mybatis.service;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SQLFactory  {
	private static SqlSessionFactory sessionFactory = null;
	static String resource = "org/mybatis/example/mybatis-config.xml";
	
	public static SqlSessionFactory getInstance() {
		if (sessionFactory == null) {
			synchronized (SQLFactory.class) {
				if (sessionFactory == null) {
					try {
						InputStream inputStream = Resources.getResourceAsStream(resource);
						sessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
		}
		return sessionFactory;
	}
}
