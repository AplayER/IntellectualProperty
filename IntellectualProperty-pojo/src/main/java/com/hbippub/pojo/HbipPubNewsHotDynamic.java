package com.hbippub.pojo;

public class HbipPubNewsHotDynamic {
    private Integer jiluid;

    private Integer xinwenid;

    private String xinwenmingcheng;

    private String fengmianurl;

    private String neirong;

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

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong == null ? null : neirong.trim();
    }
}