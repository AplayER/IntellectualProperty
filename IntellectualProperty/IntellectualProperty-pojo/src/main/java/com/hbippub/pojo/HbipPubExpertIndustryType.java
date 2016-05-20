package com.hbippub.pojo;

public class HbipPubExpertIndustryType {
    private Integer hangyeleixingid;

    private String hangyeleixingmingcheng;

    private String beizhu;

    private Integer shifouyishanchu;

    public Integer getHangyeleixingid() {
        return hangyeleixingid;
    }

    public void setHangyeleixingid(Integer hangyeleixingid) {
        this.hangyeleixingid = hangyeleixingid;
    }

    public String getHangyeleixingmingcheng() {
        return hangyeleixingmingcheng;
    }

    public void setHangyeleixingmingcheng(String hangyeleixingmingcheng) {
        this.hangyeleixingmingcheng = hangyeleixingmingcheng == null ? null : hangyeleixingmingcheng.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public Integer getShifouyishanchu() {
        return shifouyishanchu;
    }

    public void setShifouyishanchu(Integer shifouyishanchu) {
        this.shifouyishanchu = shifouyishanchu;
    }
}