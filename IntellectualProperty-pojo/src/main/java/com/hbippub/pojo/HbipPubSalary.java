package com.hbippub.pojo;

public class HbipPubSalary {
    private Integer yuexinid;

    private String yuexin;

    public Integer getYuexinid() {
        return yuexinid;
    }

    public void setYuexinid(Integer yuexinid) {
        this.yuexinid = yuexinid;
    }

    public String getYuexin() {
        return yuexin;
    }

    public void setYuexin(String yuexin) {
        this.yuexin = yuexin == null ? null : yuexin.trim();
    }
}