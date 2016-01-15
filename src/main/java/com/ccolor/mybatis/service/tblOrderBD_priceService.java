package com.ccolor.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccolor.mybatis.bean.OrderBD;
import com.ccolor.mybatis.bean.tblOrderBD_price;
import com.ccolor.mybatis.bean.tblOrderBD_priceExample;
import com.ccolor.mybatis.mapper.tblOrderBD_priceMapper;
@Service
public class tblOrderBD_priceService {
	@Autowired
	tblOrderBD_priceMapper tblOrderBD_priceMapper;
	public List<tblOrderBD_price> selectData(){
		tblOrderBD_priceExample example =new tblOrderBD_priceExample();
		return tblOrderBD_priceMapper.selectByExample(example);
	}
	public Boolean haveData(String id){
	
		if(tblOrderBD_priceMapper.selectByPrimaryKey(id)==null)return false;
		return true;
	}
	public void add(tblOrderBD_price bean){
		tblOrderBD_priceMapper.insert(bean);
	}
	public void update(tblOrderBD_price bean){
		tblOrderBD_priceMapper.updateByPrimaryKey(bean);
	}
}
