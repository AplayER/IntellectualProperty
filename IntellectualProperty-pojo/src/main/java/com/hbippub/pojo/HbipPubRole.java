package com.hbippub.pojo;

public class HbipPubRole {
    private Integer jueseid;

    private String jueseming;

    private String juesemiaoshu;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getJueseid() {
        return jueseid;
    }

    public void setJueseid(Integer jueseid) {
        this.jueseid = jueseid;
    }

    public String getJueseming() {
        return jueseming;
    }

    public void setJueseming(String jueseming) {
        this.jueseming = jueseming == null ? null : jueseming.trim();
    }

    public String getJuesemiaoshu() {
        return juesemiaoshu;
    }

    public void setJuesemiaoshu(String juesemiaoshu) {
        this.juesemiaoshu = juesemiaoshu == null ? null : juesemiaoshu.trim();
    }

    public Integer getShifouyishanchu() {
        return shifouyishanchu;
    }

    public void setShifouyishanchu(Integer shifouyishanchu) {
        this.shifouyishanchu = shifouyishanchu;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
}