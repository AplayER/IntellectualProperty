package com.hbippub.pojo;

public class HbipPubServiceType {
    private Integer fuwuleixingid;

    private Integer shangjifuwuid;

    private Integer fuwudengji;

    private String leixingmingcheng;

    private Integer shifouyishanchu;

    private Integer beizhu;

    public Integer getFuwuleixingid() {
        return fuwuleixingid;
    }

    public void setFuwuleixingid(Integer fuwuleixingid) {
        this.fuwuleixingid = fuwuleixingid;
    }

    public Integer getShangjifuwuid() {
        return shangjifuwuid;
    }

    public void setShangjifuwuid(Integer shangjifuwuid) {
        this.shangjifuwuid = shangjifuwuid;
    }

    public Integer getFuwudengji() {
        return fuwudengji;
    }

    public void setFuwudengji(Integer fuwudengji) {
        this.fuwudengji = fuwudengji;
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

    public Integer getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(Integer beizhu) {
        this.beizhu = beizhu;
    }
}