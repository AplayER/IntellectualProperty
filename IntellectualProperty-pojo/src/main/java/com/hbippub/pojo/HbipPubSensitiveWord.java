package com.hbippub.pojo;

public class HbipPubSensitiveWord {
    private Integer minganciid;

    private String minganci;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getMinganciid() {
        return minganciid;
    }

    public void setMinganciid(Integer minganciid) {
        this.minganciid = minganciid;
    }

    public String getMinganci() {
        return minganci;
    }

    public void setMinganci(String minganci) {
        this.minganci = minganci == null ? null : minganci.trim();
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