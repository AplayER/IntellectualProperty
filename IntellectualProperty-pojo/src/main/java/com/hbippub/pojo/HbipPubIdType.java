package com.hbippub.pojo;

public class HbipPubIdType {
    private Integer leixingid;

    private String leixingming;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getLeixingid() {
        return leixingid;
    }

    public void setLeixingid(Integer leixingid) {
        this.leixingid = leixingid;
    }

    public String getLeixingming() {
        return leixingming;
    }

    public void setLeixingming(String leixingming) {
        this.leixingming = leixingming == null ? null : leixingming.trim();
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