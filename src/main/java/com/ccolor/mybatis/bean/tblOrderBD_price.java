package com.ccolor.mybatis.bean;

public class tblOrderBD_price {
    private String type;

    private Integer cSelf;

    private Integer cCom;

    private Integer temp1;

    private Integer temp2;

    private Integer temp3;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getcSelf() {
        return cSelf;
    }

    public void setcSelf(Integer cSelf) {
        this.cSelf = cSelf;
    }

    public Integer getcCom() {
        return cCom;
    }

    public void setcCom(Integer cCom) {
        this.cCom = cCom;
    }

    public Integer getTemp1() {
        return temp1;
    }

    public void setTemp1(Integer temp1) {
        this.temp1 = temp1;
    }

    public Integer getTemp2() {
        return temp2;
    }

    public void setTemp2(Integer temp2) {
        this.temp2 = temp2;
    }

    public Integer getTemp3() {
        return temp3;
    }

    public void setTemp3(Integer temp3) {
        this.temp3 = temp3;
    }
}