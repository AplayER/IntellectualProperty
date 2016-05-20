package com.hbippub.pojo;

public class HbipPubWorkExperience {
    private Integer jingyanid;

    private String gongzuojingyan;

    public Integer getJingyanid() {
        return jingyanid;
    }

    public void setJingyanid(Integer jingyanid) {
        this.jingyanid = jingyanid;
    }

    public String getGongzuojingyan() {
        return gongzuojingyan;
    }

    public void setGongzuojingyan(String gongzuojingyan) {
        this.gongzuojingyan = gongzuojingyan == null ? null : gongzuojingyan.trim();
    }
}