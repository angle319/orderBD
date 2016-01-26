package com.ccolor.mybatis.mapper;

import com.ccolor.mybatis.bean.tblOrderBD;
import com.ccolor.mybatis.bean.tblOrderBDExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface tblOrderBDMapper {
    int countByExample(tblOrderBDExample example);

    int deleteByExample(tblOrderBDExample example);

    int insert(tblOrderBD record);

    int insertSelective(tblOrderBD record);

    List<tblOrderBD> selectByExample(tblOrderBDExample example);
    
    String selectResak(@Param("record") Map record);
    
    List<tblOrderBD> selectReport(@Param("record") Map record);
    
    int updateByExampleSelective(@Param("record") tblOrderBD record, @Param("example") tblOrderBDExample example);

    int updateByExample(@Param("record") tblOrderBD record, @Param("example") tblOrderBDExample example);
   
    int updateTodayPrice(Date date);
}