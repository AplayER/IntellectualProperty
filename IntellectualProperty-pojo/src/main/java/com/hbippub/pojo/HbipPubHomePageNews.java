package com.hbippub.pojo;

import java.util.Date;

public class HbipPubHomePageNews {
    private Integer xinwenid;

    private String xinwenmingcheng;

    private String fengmianurl;

    private Date tuisongshijian;

    private String neirong;

    public Integer getXinwenid() {
        return xinwenid;
    }

    public void setXinwenid(Integer xinwenid) {
        this.xinwenid = xinwenid;
    }

    public String getXinwenmingcheng() {
        return xinwenmingcheng;
    }

    public void setXinwenmingcheng(String xinwenmingcheng) {
        this.xinwenmingcheng = xinwenmingcheng == null ? null : xinwenmingcheng.trim();
    }

    public String getFengmianurl() {
        return fengmianurl;
    }

    public void setFengmianurl(String fengmianurl) {
        this.fengmianurl = fengmianurl == null ? null : fengmianurl.trim();
    }

    public Date getTuisongshijian() {
        return tuisongshijian;
    }

    public void setTuisongshijian(Date tuisongshijian) {
        this.tuisongshijian = tuisongshijian;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong == null ? null : neirong.trim();
    }
}