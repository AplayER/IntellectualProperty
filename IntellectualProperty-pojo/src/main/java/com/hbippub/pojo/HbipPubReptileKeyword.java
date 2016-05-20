package com.hbippub.pojo;

public class HbipPubReptileKeyword {
    private Integer guanjianciid;

    private String guanjianci;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getGuanjianciid() {
        return guanjianciid;
    }

    public void setGuanjianciid(Integer guanjianciid) {
        this.guanjianciid = guanjianciid;
    }

    public String getGuanjianci() {
        return guanjianci;
    }

    public void setGuanjianci(String guanjianci) {
        this.guanjianci = guanjianci == null ? null : guanjianci.trim();
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