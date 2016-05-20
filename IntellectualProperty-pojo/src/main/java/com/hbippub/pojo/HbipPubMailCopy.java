package com.hbippub.pojo;

public class HbipPubMailCopy {
    private Integer bianhaoid;

    private Integer chaosongrenid;

    private String chaosongrenxingming;

    private Integer youjianid;

    private Integer shifoushanchu;

    private String beizhu;

    public Integer getBianhaoid() {
        return bianhaoid;
    }

    public void setBianhaoid(Integer bianhaoid) {
        this.bianhaoid = bianhaoid;
    }

    public Integer getChaosongrenid() {
        return chaosongrenid;
    }

    public void setChaosongrenid(Integer chaosongrenid) {
        this.chaosongrenid = chaosongrenid;
    }

    public String getChaosongrenxingming() {
        return chaosongrenxingming;
    }

    public void setChaosongrenxingming(String chaosongrenxingming) {
        this.chaosongrenxingming = chaosongrenxingming == null ? null : chaosongrenxingming.trim();
    }

    public Integer getYoujianid() {
        return youjianid;
    }

    public void setYoujianid(Integer youjianid) {
        this.youjianid = youjianid;
    }

    public Integer getShifoushanchu() {
        return shifoushanchu;
    }

    public void setShifoushanchu(Integer shifoushanchu) {
        this.shifoushanchu = shifoushanchu;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
}