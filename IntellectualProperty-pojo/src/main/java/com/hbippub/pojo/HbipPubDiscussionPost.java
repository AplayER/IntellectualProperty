package com.hbippub.pojo;

import java.util.Date;

public class HbipPubDiscussionPost {
    private Integer tieziid;

    private Integer taolunquid;

    private Integer yonghuid;

    private String biaoti;

    private String neirong;

    private Date fabiaoshijian;

    private String fabuzhexingming;

    private Integer zhuangtai;

    private Integer huifushu;

    private Date zuihouhuifushijian;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getTieziid() {
        return tieziid;
    }

    public void setTieziid(Integer tieziid) {
        this.tieziid = tieziid;
    }

    public Integer getTaolunquid() {
        return taolunquid;
    }

    public void setTaolunquid(Integer taolunquid) {
        this.taolunquid = taolunquid;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public String getBiaoti() {
        return biaoti;
    }

    public void setBiaoti(String biaoti) {
        this.biaoti = biaoti == null ? null : biaoti.trim();
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong == null ? null : neirong.trim();
    }

    public Date getFabiaoshijian() {
        return fabiaoshijian;
    }

    public void setFabiaoshijian(Date fabiaoshijian) {
        this.fabiaoshijian = fabiaoshijian;
    }

    public String getFabuzhexingming() {
        return fabuzhexingming;
    }

    public void setFabuzhexingming(String fabuzhexingming) {
        this.fabuzhexingming = fabuzhexingming == null ? null : fabuzhexingming.trim();
    }

    public Integer getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(Integer zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public Integer getHuifushu() {
        return huifushu;
    }

    public void setHuifushu(Integer huifushu) {
        this.huifushu = huifushu;
    }

    public Date getZuihouhuifushijian() {
        return zuihouhuifushijian;
    }

    public void setZuihouhuifushijian(Date zuihouhuifushijian) {
        this.zuihouhuifushijian = zuihouhuifushijian;
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