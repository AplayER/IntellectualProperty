package com.hbippub.pojo;

public class HbipPubAuctionMode {
    private Integer paimaimoshiid;

    private String moshimingcheng;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getPaimaimoshiid() {
        return paimaimoshiid;
    }

    public void setPaimaimoshiid(Integer paimaimoshiid) {
        this.paimaimoshiid = paimaimoshiid;
    }

    public String getMoshimingcheng() {
        return moshimingcheng;
    }

    public void setMoshimingcheng(String moshimingcheng) {
        this.moshimingcheng = moshimingcheng == null ? null : moshimingcheng.trim();
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