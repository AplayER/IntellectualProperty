package com.hbippub.pojo;

public class HbipPubProjectTemplate {
    private Integer mobanid;

    private Integer yonghuid;

    private String mobanmingcheng;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getMobanid() {
        return mobanid;
    }

    public void setMobanid(Integer mobanid) {
        this.mobanid = mobanid;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public String getMobanmingcheng() {
        return mobanmingcheng;
    }

    public void setMobanmingcheng(String mobanmingcheng) {
        this.mobanmingcheng = mobanmingcheng == null ? null : mobanmingcheng.trim();
    }

    public Integer getShifouyishanchu() {
        return shifouyishanchu;
    }

    public void setShifouyishanchu(Integer shifouyishanchu) {
        this.shifouyishanchu = shifouyishanchu;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
}