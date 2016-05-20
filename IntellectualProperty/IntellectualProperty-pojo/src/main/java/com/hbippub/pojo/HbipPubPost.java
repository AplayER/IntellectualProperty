package com.hbippub.pojo;

import java.util.Date;

public class HbipPubPost {
    private Integer tieziid;

    private Integer yewuleixingid;

    private Integer shangpinid;

    private Integer shifouhuifu;

    private Integer huifutieziid;

    private Integer huifushu;

    private Integer yonghuid;

    private String tiezineirong;

    private Date fatieshijian;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getTieziid() {
        return tieziid;
    }

    public void setTieziid(Integer tieziid) {
        this.tieziid = tieziid;
    }

    public Integer getYewuleixingid() {
        return yewuleixingid;
    }

    public void setYewuleixingid(Integer yewuleixingid) {
        this.yewuleixingid = yewuleixingid;
    }

    public Integer getShangpinid() {
        return shangpinid;
    }

    public void setShangpinid(Integer shangpinid) {
        this.shangpinid = shangpinid;
    }

    public Integer getShifouhuifu() {
        return shifouhuifu;
    }

    public void setShifouhuifu(Integer shifouhuifu) {
        this.shifouhuifu = shifouhuifu;
    }

    public Integer getHuifutieziid() {
        return huifutieziid;
    }

    public void setHuifutieziid(Integer huifutieziid) {
        this.huifutieziid = huifutieziid;
    }

    public Integer getHuifushu() {
        return huifushu;
    }

    public void setHuifushu(Integer huifushu) {
        this.huifushu = huifushu;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public String getTiezineirong() {
        return tiezineirong;
    }

    public void setTiezineirong(String tiezineirong) {
        this.tiezineirong = tiezineirong == null ? null : tiezineirong.trim();
    }

    public Date getFatieshijian() {
        return fatieshijian;
    }

    public void setFatieshijian(Date fatieshijian) {
        this.fatieshijian = fatieshijian;
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