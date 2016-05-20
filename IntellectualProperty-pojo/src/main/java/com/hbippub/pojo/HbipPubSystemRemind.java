package com.hbippub.pojo;

import java.util.Date;

public class HbipPubSystemRemind {
    private Integer tixingid;

    private Integer yonghuid;

    private Integer fasongzheid;

    private Integer tixingleibie;

    private String xiaoxineirong;

    private Date jieshoushijian;

    private Integer shifouyichuli;

    private String tupianurl;

    private String fasongzhetouxiangurl;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getTixingid() {
        return tixingid;
    }

    public void setTixingid(Integer tixingid) {
        this.tixingid = tixingid;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public Integer getFasongzheid() {
        return fasongzheid;
    }

    public void setFasongzheid(Integer fasongzheid) {
        this.fasongzheid = fasongzheid;
    }

    public Integer getTixingleibie() {
        return tixingleibie;
    }

    public void setTixingleibie(Integer tixingleibie) {
        this.tixingleibie = tixingleibie;
    }

    public String getXiaoxineirong() {
        return xiaoxineirong;
    }

    public void setXiaoxineirong(String xiaoxineirong) {
        this.xiaoxineirong = xiaoxineirong == null ? null : xiaoxineirong.trim();
    }

    public Date getJieshoushijian() {
        return jieshoushijian;
    }

    public void setJieshoushijian(Date jieshoushijian) {
        this.jieshoushijian = jieshoushijian;
    }

    public Integer getShifouyichuli() {
        return shifouyichuli;
    }

    public void setShifouyichuli(Integer shifouyichuli) {
        this.shifouyichuli = shifouyichuli;
    }

    public String getTupianurl() {
        return tupianurl;
    }

    public void setTupianurl(String tupianurl) {
        this.tupianurl = tupianurl == null ? null : tupianurl.trim();
    }

    public String getFasongzhetouxiangurl() {
        return fasongzhetouxiangurl;
    }

    public void setFasongzhetouxiangurl(String fasongzhetouxiangurl) {
        this.fasongzhetouxiangurl = fasongzhetouxiangurl == null ? null : fasongzhetouxiangurl.trim();
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