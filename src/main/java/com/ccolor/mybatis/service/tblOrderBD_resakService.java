package com.ccolor.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccolor.mybatis.bean.OrderBD;
import com.ccolor.mybatis.bean.tblOrderBD_resak;
import com.ccolor.mybatis.bean.tblOrderBD_resakExample;
import com.ccolor.mybatis.mapper.tblOrderBD_resakMapper;
@Service
public class tblOrderBD_resakService {
	@Autowired
	tblOrderBD_resakMapper tblOrderBD_resakMapper;
	
	public Boolean haveData(String workerid){
		if(tblOrderBD_resakMapper.selectByPrimaryKey(workerid)==null)return false;
		return true;
	}
	public List<tblOrderBD_resak> selectResak(){
		return tblOrderBD_resakMapper.selectResak();
	}
	public List<tblOrderBD_resak> selectData(){
		tblOrderBD_resakExample ex=new tblOrderBD_resakExample();
		return tblOrderBD_resakMapper.selectByExample(ex);
	}
	public void add(tblOrderBD_resak record){
		tblOrderBD_resakMapper.insert(record);
	}
	public void update(tblOrderBD_resak record){
		tblOrderBD_resakMapper.updateByPrimaryKey(record);
	}
}
