package com.hbippub.pojo;

public class HbipPubEduBackground {
    private Integer xueliid;

    private String xuelimingcheng;

    public Integer getXueliid() {
        return xueliid;
    }

    public void setXueliid(Integer xueliid) {
        this.xueliid = xueliid;
    }

    public String getXuelimingcheng() {
        return xuelimingcheng;
    }

    public void setXuelimingcheng(String xuelimingcheng) {
        this.xuelimingcheng = xuelimingcheng == null ? null : xuelimingcheng.trim();
    }
}