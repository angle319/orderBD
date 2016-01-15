package com.ccolor.mybatis.mapper;

import com.ccolor.mybatis.bean.tblOrderBD_price;
import com.ccolor.mybatis.bean.tblOrderBD_priceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tblOrderBD_priceMapper {
    int countByExample(tblOrderBD_priceExample example);

    int deleteByExample(tblOrderBD_priceExample example);

    int deleteByPrimaryKey(String type);

    int insert(tblOrderBD_price record);

    int insertSelective(tblOrderBD_price record);

    List<tblOrderBD_price> selectByExample(tblOrderBD_priceExample example);

    tblOrderBD_price selectByPrimaryKey(String type);

    int updateByExampleSelective(@Param("record") tblOrderBD_price record, @Param("example") tblOrderBD_priceExample example);

    int updateByExample(@Param("record") tblOrderBD_price record, @Param("example") tblOrderBD_priceExample example);

    int updateByPrimaryKeySelective(tblOrderBD_price record);

    int updateByPrimaryKey(tblOrderBD_price record);
}