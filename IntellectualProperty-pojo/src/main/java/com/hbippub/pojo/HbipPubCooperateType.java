package com.hbippub.pojo;

public class HbipPubCooperateType {
    private String hezuoleixingid;

    private String hezuoleixingmingcheng;

    private Integer shifouyishanchu;

    private String beizhu;

    public String getHezuoleixingid() {
        return hezuoleixingid;
    }

    public void setHezuoleixingid(String hezuoleixingid) {
        this.hezuoleixingid = hezuoleixingid == null ? null : hezuoleixingid.trim();
    }

    public String getHezuoleixingmingcheng() {
        return hezuoleixingmingcheng;
    }

    public void setHezuoleixingmingcheng(String hezuoleixingmingcheng) {
        this.hezuoleixingmingcheng = hezuoleixingmingcheng == null ? null : hezuoleixingmingcheng.trim();
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