package com.ccolor.mybatis.bean;

import java.util.Date;

public class tblOrderBD {
    private String workerid;

    private String resak002;

    private Date date;

    private String mid;

    private String night;

    private String temp1;

    private String temp2;

    private String type;

    private String cCom;

    private String cSelf;

    private String self;

    private String sCom;

    public String getWorkerid() {
        return workerid;
    }

    public void setWorkerid(String workerid) {
        this.workerid = workerid == null ? null : workerid.trim();
    }

    public String getResak002() {
        return resak002;
    }

    public void setResak002(String resak002) {
        this.resak002 = resak002 == null ? null : resak002.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public String getNight() {
        return night;
    }

    public void setNight(String night) {
        this.night = night == null ? null : night.trim();
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1 == null ? null : temp1.trim();
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2 == null ? null : temp2.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getcCom() {
        return cCom;
    }

    public void setcCom(String cCom) {
        this.cCom = cCom == null ? null : cCom.trim();
    }

    public String getcSelf() {
        return cSelf;
    }

    public void setcSelf(String cSelf) {
        this.cSelf = cSelf == null ? null : cSelf.trim();
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self == null ? null : self.trim();
    }

    public String getsCom() {
        return sCom;
    }

    public void setsCom(String sCom) {
        this.sCom = sCom == null ? null : sCom.trim();
    }
}