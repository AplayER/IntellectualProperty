package com.hbippub.pojo;

public class HbipPubCopyrightType {
    private Integer banquanleixingid;

    private String leixingmingcheng;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getBanquanleixingid() {
        return banquanleixingid;
    }

    public void setBanquanleixingid(Integer banquanleixingid) {
        this.banquanleixingid = banquanleixingid;
    }

    public String getLeixingmingcheng() {
        return leixingmingcheng;
    }

    public void setLeixingmingcheng(String leixingmingcheng) {
        this.leixingmingcheng = leixingmingcheng == null ? null : leixingmingcheng.trim();
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