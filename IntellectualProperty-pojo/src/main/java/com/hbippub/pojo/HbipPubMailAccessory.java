package com.hbippub.pojo;

public class HbipPubMailAccessory {
    private Integer fujianid;

    private Integer youjianid;

    private String fujianmingcheng;

    private String fujianurl;

    private Integer shifoushanchu;

    private String beizhu;

    public Integer getFujianid() {
        return fujianid;
    }

    public void setFujianid(Integer fujianid) {
        this.fujianid = fujianid;
    }

    public Integer getYoujianid() {
        return youjianid;
    }

    public void setYoujianid(Integer youjianid) {
        this.youjianid = youjianid;
    }

    public String getFujianmingcheng() {
        return fujianmingcheng;
    }

    public void setFujianmingcheng(String fujianmingcheng) {
        this.fujianmingcheng = fujianmingcheng == null ? null : fujianmingcheng.trim();
    }

    public String getFujianurl() {
        return fujianurl;
    }

    public void setFujianurl(String fujianurl) {
        this.fujianurl = fujianurl == null ? null : fujianurl.trim();
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