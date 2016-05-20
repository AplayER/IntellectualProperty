package com.hbippub.pojo;

public class HbipPubNewsAccessory {
    private Integer fujianid;

    private Integer xinwenid;

    private String fujianmingcheng;

    private String fujianurl;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getFujianid() {
        return fujianid;
    }

    public void setFujianid(Integer fujianid) {
        this.fujianid = fujianid;
    }

    public Integer getXinwenid() {
        return xinwenid;
    }

    public void setXinwenid(Integer xinwenid) {
        this.xinwenid = xinwenid;
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