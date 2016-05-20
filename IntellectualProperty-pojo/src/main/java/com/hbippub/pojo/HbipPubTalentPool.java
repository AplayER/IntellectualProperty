package com.hbippub.pojo;

public class HbipPubTalentPool {
    private Integer rencaikuid;

    private String rencaikuming;

    private String fengmianurl;

    private String jianjie;

    public Integer getRencaikuid() {
        return rencaikuid;
    }

    public void setRencaikuid(Integer rencaikuid) {
        this.rencaikuid = rencaikuid;
    }

    public String getRencaikuming() {
        return rencaikuming;
    }

    public void setRencaikuming(String rencaikuming) {
        this.rencaikuming = rencaikuming == null ? null : rencaikuming.trim();
    }

    public String getFengmianurl() {
        return fengmianurl;
    }

    public void setFengmianurl(String fengmianurl) {
        this.fengmianurl = fengmianurl == null ? null : fengmianurl.trim();
    }

    public String getJianjie() {
        return jianjie;
    }

    public void setJianjie(String jianjie) {
        this.jianjie = jianjie == null ? null : jianjie.trim();
    }
}