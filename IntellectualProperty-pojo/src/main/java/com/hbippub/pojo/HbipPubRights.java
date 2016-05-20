package com.hbippub.pojo;

public class HbipPubRights {
    private Integer quanxianid;

    private String quanxianming;

    private String quanxianmiaoshu;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getQuanxianid() {
        return quanxianid;
    }

    public void setQuanxianid(Integer quanxianid) {
        this.quanxianid = quanxianid;
    }

    public String getQuanxianming() {
        return quanxianming;
    }

    public void setQuanxianming(String quanxianming) {
        this.quanxianming = quanxianming == null ? null : quanxianming.trim();
    }

    public String getQuanxianmiaoshu() {
        return quanxianmiaoshu;
    }

    public void setQuanxianmiaoshu(String quanxianmiaoshu) {
        this.quanxianmiaoshu = quanxianmiaoshu == null ? null : quanxianmiaoshu.trim();
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