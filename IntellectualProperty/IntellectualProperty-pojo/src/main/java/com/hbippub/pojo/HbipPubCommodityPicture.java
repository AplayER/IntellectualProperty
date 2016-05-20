package com.hbippub.pojo;

public class HbipPubCommodityPicture {
    private Integer tupianid;

    private Integer shangpinid;

    private Integer tupianleixing;

    private String url1;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getTupianid() {
        return tupianid;
    }

    public void setTupianid(Integer tupianid) {
        this.tupianid = tupianid;
    }

    public Integer getShangpinid() {
        return shangpinid;
    }

    public void setShangpinid(Integer shangpinid) {
        this.shangpinid = shangpinid;
    }

    public Integer getTupianleixing() {
        return tupianleixing;
    }

    public void setTupianleixing(Integer tupianleixing) {
        this.tupianleixing = tupianleixing;
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1 == null ? null : url1.trim();
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