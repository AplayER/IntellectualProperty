package com.hbippub.pojo;

import java.util.Date;

public class HbipPubNewsCapture {
    private Integer xinwenid;

    private String xinwenbiaoti;

    private String xinwenfaburiqi;

    private Date xinwenhuoquriqi;

    private String xinwenurl;

    public Integer getXinwenid() {
        return xinwenid;
    }

    public void setXinwenid(Integer xinwenid) {
        this.xinwenid = xinwenid;
    }

    public String getXinwenbiaoti() {
        return xinwenbiaoti;
    }

    public void setXinwenbiaoti(String xinwenbiaoti) {
        this.xinwenbiaoti = xinwenbiaoti == null ? null : xinwenbiaoti.trim();
    }

    public String getXinwenfaburiqi() {
        return xinwenfaburiqi;
    }

    public void setXinwenfaburiqi(String xinwenfaburiqi) {
        this.xinwenfaburiqi = xinwenfaburiqi == null ? null : xinwenfaburiqi.trim();
    }

    public Date getXinwenhuoquriqi() {
        return xinwenhuoquriqi;
    }

    public void setXinwenhuoquriqi(Date xinwenhuoquriqi) {
        this.xinwenhuoquriqi = xinwenhuoquriqi;
    }

    public String getXinwenurl() {
        return xinwenurl;
    }

    public void setXinwenurl(String xinwenurl) {
        this.xinwenurl = xinwenurl == null ? null : xinwenurl.trim();
    }
}