package com.hbippub.pojo;

import java.util.Date;

public class HbipPubEduPost {
    private Integer tieziid;

    private String biaoti;

    private Integer louzhuid;

    private String louzhuxingming;

    private Integer zuijinhuifuzheid;

    private String zuijinhuifuzhexingming;

    private Date zuijinhuifushijian;

    private Date fabushijian;

    private Integer shoucangshu;

    private Integer huifushu;

    private Integer shifouyishanchu;

    private String tiezineirong;

    public Integer getTieziid() {
        return tieziid;
    }

    public void setTieziid(Integer tieziid) {
        this.tieziid = tieziid;
    }

    public String getBiaoti() {
        return biaoti;
    }

    public void setBiaoti(String biaoti) {
        this.biaoti = biaoti == null ? null : biaoti.trim();
    }

    public Integer getLouzhuid() {
        return louzhuid;
    }

    public void setLouzhuid(Integer louzhuid) {
        this.louzhuid = louzhuid;
    }

    public String getLouzhuxingming() {
        return louzhuxingming;
    }

    public void setLouzhuxingming(String louzhuxingming) {
        this.louzhuxingming = louzhuxingming == null ? null : louzhuxingming.trim();
    }

    public Integer getZuijinhuifuzheid() {
        return zuijinhuifuzheid;
    }

    public void setZuijinhuifuzheid(Integer zuijinhuifuzheid) {
        this.zuijinhuifuzheid = zuijinhuifuzheid;
    }

    public String getZuijinhuifuzhexingming() {
        return zuijinhuifuzhexingming;
    }

    public void setZuijinhuifuzhexingming(String zuijinhuifuzhexingming) {
        this.zuijinhuifuzhexingming = zuijinhuifuzhexingming == null ? null : zuijinhuifuzhexingming.trim();
    }

    public Date getZuijinhuifushijian() {
        return zuijinhuifushijian;
    }

    public void setZuijinhuifushijian(Date zuijinhuifushijian) {
        this.zuijinhuifushijian = zuijinhuifushijian;
    }

    public Date getFabushijian() {
        return fabushijian;
    }

    public void setFabushijian(Date fabushijian) {
        this.fabushijian = fabushijian;
    }

    public Integer getShoucangshu() {
        return shoucangshu;
    }

    public void setShoucangshu(Integer shoucangshu) {
        this.shoucangshu = shoucangshu;
    }

    public Integer getHuifushu() {
        return huifushu;
    }

    public void setHuifushu(Integer huifushu) {
        this.huifushu = huifushu;
    }

    public Integer getShifouyishanchu() {
        return shifouyishanchu;
    }

    public void setShifouyishanchu(Integer shifouyishanchu) {
        this.shifouyishanchu = shifouyishanchu;
    }

    public String getTiezineirong() {
        return tiezineirong;
    }

    public void setTiezineirong(String tiezineirong) {
        this.tiezineirong = tiezineirong == null ? null : tiezineirong.trim();
    }
}