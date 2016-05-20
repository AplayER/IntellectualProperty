package com.hbippub.pojo;

import java.util.Date;

public class HbipPubQuestionnaireSurvey {
    private Integer wenjuanid;

    private Integer yonghuid;

    private String wenjuanbiaoti;

    private Date chuangjianshijian;

    private Integer shifoushanchu;

    private String beizhu;

    public Integer getWenjuanid() {
        return wenjuanid;
    }

    public void setWenjuanid(Integer wenjuanid) {
        this.wenjuanid = wenjuanid;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public String getWenjuanbiaoti() {
        return wenjuanbiaoti;
    }

    public void setWenjuanbiaoti(String wenjuanbiaoti) {
        this.wenjuanbiaoti = wenjuanbiaoti == null ? null : wenjuanbiaoti.trim();
    }

    public Date getChuangjianshijian() {
        return chuangjianshijian;
    }

    public void setChuangjianshijian(Date chuangjianshijian) {
        this.chuangjianshijian = chuangjianshijian;
    }

    public Integer getShifoushanchu() {
        return shifoushanchu;
    }

    public void setShifoushanchu(Integer shifoushanchu) {
        this.shifoushanchu = shifoushanchu;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
}