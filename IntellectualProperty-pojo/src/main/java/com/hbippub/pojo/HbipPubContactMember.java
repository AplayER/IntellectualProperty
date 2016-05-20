package com.hbippub.pojo;

import java.util.Date;

public class HbipPubContactMember {
    private Integer chengyuanid;

    private Integer tongxunluid;

    private Integer yonghuid;

    private Integer chuangjianyonghuid;

    private String yonghuxingming;

    private Date jiarushijian;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getChengyuanid() {
        return chengyuanid;
    }

    public void setChengyuanid(Integer chengyuanid) {
        this.chengyuanid = chengyuanid;
    }

    public Integer getTongxunluid() {
        return tongxunluid;
    }

    public void setTongxunluid(Integer tongxunluid) {
        this.tongxunluid = tongxunluid;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public Integer getChuangjianyonghuid() {
        return chuangjianyonghuid;
    }

    public void setChuangjianyonghuid(Integer chuangjianyonghuid) {
        this.chuangjianyonghuid = chuangjianyonghuid;
    }

    public String getYonghuxingming() {
        return yonghuxingming;
    }

    public void setYonghuxingming(String yonghuxingming) {
        this.yonghuxingming = yonghuxingming == null ? null : yonghuxingming.trim();
    }

    public Date getJiarushijian() {
        return jiarushijian;
    }

    public void setJiarushijian(Date jiarushijian) {
        this.jiarushijian = jiarushijian;
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