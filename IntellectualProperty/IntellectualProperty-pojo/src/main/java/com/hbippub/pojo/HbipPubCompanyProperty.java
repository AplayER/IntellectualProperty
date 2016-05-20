package com.hbippub.pojo;

public class HbipPubCompanyProperty {
    private Integer danweixingzhiid;

    private String danweixingzhi;

    public Integer getDanweixingzhiid() {
        return danweixingzhiid;
    }

    public void setDanweixingzhiid(Integer danweixingzhiid) {
        this.danweixingzhiid = danweixingzhiid;
    }

    public String getDanweixingzhi() {
        return danweixingzhi;
    }

    public void setDanweixingzhi(String danweixingzhi) {
        this.danweixingzhi = danweixingzhi == null ? null : danweixingzhi.trim();
    }
}