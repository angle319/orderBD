package com.ccolor.mybatis.mapper;

import com.ccolor.mybatis.bean.tblOrderBD_resak;
import com.ccolor.mybatis.bean.tblOrderBD_resakExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tblOrderBD_resakMapper {
    int countByExample(tblOrderBD_resakExample example);

    int deleteByExample(tblOrderBD_resakExample example);

    int deleteByPrimaryKey(String workerid);

    int insert(tblOrderBD_resak record);

    int insertSelective(tblOrderBD_resak record);

    List<tblOrderBD_resak> selectByExample(tblOrderBD_resakExample example);

    tblOrderBD_resak selectByPrimaryKey(String workerid);
    
    List<tblOrderBD_resak> selectResak();//resak default

    int updateByExampleSelective(@Param("record") tblOrderBD_resak record, @Param("example") tblOrderBD_resakExample example);

    int updateByExample(@Param("record") tblOrderBD_resak record, @Param("example") tblOrderBD_resakExample example);

    int updateByPrimaryKeySelective(tblOrderBD_resak record);

    int updateByPrimaryKey(tblOrderBD_resak record);
}