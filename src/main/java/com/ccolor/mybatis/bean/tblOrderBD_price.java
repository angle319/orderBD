package com.ccolor.mybatis.bean;

public class tblOrderBD_price {
    private String type;

    private Integer cSelf;

    private Integer cCom;

    private Integer temp1;

    private Integer self;

    private Integer sCom;

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

    public Integer getSelf() {
        return self;
    }

    public void setSelf(Integer self) {
        this.self = self;
    }

    public Integer getsCom() {
        return sCom;
    }

    public void setsCom(Integer sCom) {
        this.sCom = sCom;
    }
}