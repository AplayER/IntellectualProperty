package com.hbippub.pojo;

public class HbipPubStudent {
    private Integer xueshengid;

    private String xueshengxingming;

    private Integer xueshengnianling;

    public Integer getXueshengid() {
        return xueshengid;
    }

    public void setXueshengid(Integer xueshengid) {
        this.xueshengid = xueshengid;
    }

    public String getXueshengxingming() {
        return xueshengxingming;
    }

    public void setXueshengxingming(String xueshengxingming) {
        this.xueshengxingming = xueshengxingming == null ? null : xueshengxingming.trim();
    }

    public Integer getXueshengnianling() {
        return xueshengnianling;
    }

    public void setXueshengnianling(Integer xueshengnianling) {
        this.xueshengnianling = xueshengnianling;
    }
}