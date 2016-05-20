package com.hbippub.pojo;

public class HbipPubNewsHotImage {
    private Integer jiluid;

    private Integer xinwenid;

    private String xinwenmingcheng;

    private String fengmianurl;

    public Integer getJiluid() {
        return jiluid;
    }

    public void setJiluid(Integer jiluid) {
        this.jiluid = jiluid;
    }

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
}