package com.ccolor.mybatis.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccolor.mybatis.mapper.tblOrderBDMapper;
import com.ccolor.mybatis.bean.OrderBD;
import com.ccolor.mybatis.bean.tblOrderBD;
import com.ccolor.mybatis.bean.tblOrderBDExample;
import com.ccolor.mybatis.bean.tblOrderBDExample.Criteria;

@Service
public class tblOrderBDService {
	@Autowired
	tblOrderBDMapper tblOrderBDMapper;

	public String selectResak(String resak001, String resak002) {
		Map map = new HashMap();
		map.put("resak001", resak001);
		map.put("resak002", resak002);
		String k = tblOrderBDMapper.selectResak(map);
		if (k != null && !"".equals(k))
			return k;
		return "";
	}

	public List<tblOrderBD> selectData(Date s_time, Date e_time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<Object> list = new ArrayList<Object>();
		tblOrderBDExample example = new tblOrderBDExample();
		Criteria ca = example.createCriteria();
		if (s_time != null) {
			ca.andDateGreaterThanOrEqualTo(s_time);
		}
		if (e_time != null) {
			ca.andDateLessThanOrEqualTo(e_time);
		}
		return tblOrderBDMapper.selectByExample(example);
	}

	public List<OrderBD> selectData(String uid, String name, Date s_time, Date e_time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<OrderBD> list = new ArrayList<OrderBD>();
		tblOrderBDExample example = new tblOrderBDExample();
		Criteria ca = example.createCriteria();
		ca.andWorkeridEqualTo(uid);
		ca.andResak002EqualTo(name);
		ca.andDateGreaterThanOrEqualTo(s_time);
		ca.andDateLessThanOrEqualTo(e_time);
		List _list = tblOrderBDMapper.selectByExample(example);
		for (Object o : _list) {
			tblOrderBD obj = (tblOrderBD) o;
			OrderBD bd = new OrderBD();
			String[] str = { obj.getMid(), obj.getNight() };
			bd.setKey(sdf.format(obj.getDate()));
			bd.setValue(str);
			list.add(bd);
		}
		return list;
	}

	@Transactional
	public void saveData(String uid, String name, List<OrderBD> list, Date s_time, Date e_time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		tblOrderBDExample example = new tblOrderBDExample();
		Criteria ca = example.createCriteria();
		ca.andWorkeridEqualTo(uid);
		ca.andResak002EqualTo(name);
		ca.andDateGreaterThanOrEqualTo(s_time);
		ca.andDateLessThanOrEqualTo(e_time);
		tblOrderBDMapper.deleteByExample(example);
		List<tblOrderBD> _list = new ArrayList<tblOrderBD>();
		try {
			for (OrderBD object : list) {
				tblOrderBD obj = new tblOrderBD();
				obj.setWorkerid(uid);
				obj.setResak002(name);
				obj.setDate(sdf.parse(object.getKey()));
				obj.setMid(object.getValue()[0]);
				obj.setNight(object.getValue()[1]);
				tblOrderBDMapper.insert(obj);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
