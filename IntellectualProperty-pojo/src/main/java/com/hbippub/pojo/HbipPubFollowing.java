package com.hbippub.pojo;

import java.util.Date;

public class HbipPubFollowing {
    private Integer guanzhuid;

    private Integer yonghuid;

    private String yonghuxingming;

    private Integer beiguanzhuyonghuid;

    private String beiguanzhuyonghuxingming;

    private Date guanzhushijian;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getGuanzhuid() {
        return guanzhuid;
    }

    public void setGuanzhuid(Integer guanzhuid) {
        this.guanzhuid = guanzhuid;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public String getYonghuxingming() {
        return yonghuxingming;
    }

    public void setYonghuxingming(String yonghuxingming) {
        this.yonghuxingming = yonghuxingming == null ? null : yonghuxingming.trim();
    }

    public Integer getBeiguanzhuyonghuid() {
        return beiguanzhuyonghuid;
    }

    public void setBeiguanzhuyonghuid(Integer beiguanzhuyonghuid) {
        this.beiguanzhuyonghuid = beiguanzhuyonghuid;
    }

    public String getBeiguanzhuyonghuxingming() {
        return beiguanzhuyonghuxingming;
    }

    public void setBeiguanzhuyonghuxingming(String beiguanzhuyonghuxingming) {
        this.beiguanzhuyonghuxingming = beiguanzhuyonghuxingming == null ? null : beiguanzhuyonghuxingming.trim();
    }

    public Date getGuanzhushijian() {
        return guanzhushijian;
    }

    public void setGuanzhushijian(Date guanzhushijian) {
        this.guanzhushijian = guanzhushijian;
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