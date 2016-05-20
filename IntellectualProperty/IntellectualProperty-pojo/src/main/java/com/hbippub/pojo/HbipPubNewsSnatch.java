package com.hbippub.pojo;

public class HbipPubNewsSnatch {
    private Integer xinwenid;

    private String xinwenbiaoti;

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

    public String getXinwenurl() {
        return xinwenurl;
    }

    public void setXinwenurl(String xinwenurl) {
        this.xinwenurl = xinwenurl == null ? null : xinwenurl.trim();
    }
}