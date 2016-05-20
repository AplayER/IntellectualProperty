package com.hbippub.pojo;

import java.util.Date;

public class HbipPubNewsHotWord {
    private Integer jiluid;

    private Integer xinwenid;

    private String xinwenmingcheng;

    private String neirong;

    private Date fabushijian;

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

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong == null ? null : neirong.trim();
    }

    public Date getFabushijian() {
        return fabushijian;
    }

    public void setFabushijian(Date fabushijian) {
        this.fabushijian = fabushijian;
    }
}