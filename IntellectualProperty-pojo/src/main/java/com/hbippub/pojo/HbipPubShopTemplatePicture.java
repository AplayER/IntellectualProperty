package com.hbippub.pojo;

public class HbipPubShopTemplatePicture {
    private Integer tupianid;

    private Integer leixingid;

    private Integer mubanid;

    private String tupianlujing;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getTupianid() {
        return tupianid;
    }

    public void setTupianid(Integer tupianid) {
        this.tupianid = tupianid;
    }

    public Integer getLeixingid() {
        return leixingid;
    }

    public void setLeixingid(Integer leixingid) {
        this.leixingid = leixingid;
    }

    public Integer getMubanid() {
        return mubanid;
    }

    public void setMubanid(Integer mubanid) {
        this.mubanid = mubanid;
    }

    public String getTupianlujing() {
        return tupianlujing;
    }

    public void setTupianlujing(String tupianlujing) {
        this.tupianlujing = tupianlujing == null ? null : tupianlujing.trim();
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