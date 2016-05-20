package com.hbippub.pojo;

import java.util.Date;

public class HbipPubFormTransmit {
    private Integer bianhaoid;

    private Integer zhuanfazhuanjiaid;

    private String zhuanfazhuanjiaxingming;

    private Date zhuanfashijian;

    private Integer huifuzhuangtai;

    private Date huifushijian;

    private Integer shifouyishanchu;

    private String beizhu;

    private String shenheyijian;

    private Integer shenqingbiaoid;

    private Integer shifounengchakan;

    private Integer shifounengpinglun;

    private String zhuanjialeibie;

    public Integer getBianhaoid() {
        return bianhaoid;
    }

    public void setBianhaoid(Integer bianhaoid) {
        this.bianhaoid = bianhaoid;
    }

    public Integer getZhuanfazhuanjiaid() {
        return zhuanfazhuanjiaid;
    }

    public void setZhuanfazhuanjiaid(Integer zhuanfazhuanjiaid) {
        this.zhuanfazhuanjiaid = zhuanfazhuanjiaid;
    }

    public String getZhuanfazhuanjiaxingming() {
        return zhuanfazhuanjiaxingming;
    }

    public void setZhuanfazhuanjiaxingming(String zhuanfazhuanjiaxingming) {
        this.zhuanfazhuanjiaxingming = zhuanfazhuanjiaxingming == null ? null : zhuanfazhuanjiaxingming.trim();
    }

    public Date getZhuanfashijian() {
        return zhuanfashijian;
    }

    public void setZhuanfashijian(Date zhuanfashijian) {
        this.zhuanfashijian = zhuanfashijian;
    }

    public Integer getHuifuzhuangtai() {
        return huifuzhuangtai;
    }

    public void setHuifuzhuangtai(Integer huifuzhuangtai) {
        this.huifuzhuangtai = huifuzhuangtai;
    }

    public Date getHuifushijian() {
        return huifushijian;
    }

    public void setHuifushijian(Date huifushijian) {
        this.huifushijian = huifushijian;
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

    public String getShenheyijian() {
        return shenheyijian;
    }

    public void setShenheyijian(String shenheyijian) {
        this.shenheyijian = shenheyijian == null ? null : shenheyijian.trim();
    }

    public Integer getShenqingbiaoid() {
        return shenqingbiaoid;
    }

    public void setShenqingbiaoid(Integer shenqingbiaoid) {
        this.shenqingbiaoid = shenqingbiaoid;
    }

    public Integer getShifounengchakan() {
        return shifounengchakan;
    }

    public void setShifounengchakan(Integer shifounengchakan) {
        this.shifounengchakan = shifounengchakan;
    }

    public Integer getShifounengpinglun() {
        return shifounengpinglun;
    }

    public void setShifounengpinglun(Integer shifounengpinglun) {
        this.shifounengpinglun = shifounengpinglun;
    }

    public String getZhuanjialeibie() {
        return zhuanjialeibie;
    }

    public void setZhuanjialeibie(String zhuanjialeibie) {
        this.zhuanjialeibie = zhuanjialeibie == null ? null : zhuanjialeibie.trim();
    }
}