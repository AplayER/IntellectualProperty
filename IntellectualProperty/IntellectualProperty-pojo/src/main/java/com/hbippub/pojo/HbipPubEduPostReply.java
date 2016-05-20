package com.hbippub.pojo;

import java.util.Date;

public class HbipPubEduPostReply {
    private Integer huifuid;

    private Integer tieziid;

    private Integer huifuzheid;

    private String huifuzhexingming;

    private String huifuzheurl;

    private Integer shifouerjihuifu;

    private Integer beihuifuid;

    private Integer erjihuifushu;

    private Date huifushijian;

    private Integer shifouyishanchu;

    private String huifuneirong;

    public Integer getHuifuid() {
        return huifuid;
    }

    public void setHuifuid(Integer huifuid) {
        this.huifuid = huifuid;
    }

    public Integer getTieziid() {
        return tieziid;
    }

    public void setTieziid(Integer tieziid) {
        this.tieziid = tieziid;
    }

    public Integer getHuifuzheid() {
        return huifuzheid;
    }

    public void setHuifuzheid(Integer huifuzheid) {
        this.huifuzheid = huifuzheid;
    }

    public String getHuifuzhexingming() {
        return huifuzhexingming;
    }

    public void setHuifuzhexingming(String huifuzhexingming) {
        this.huifuzhexingming = huifuzhexingming == null ? null : huifuzhexingming.trim();
    }

    public String getHuifuzheurl() {
        return huifuzheurl;
    }

    public void setHuifuzheurl(String huifuzheurl) {
        this.huifuzheurl = huifuzheurl == null ? null : huifuzheurl.trim();
    }

    public Integer getShifouerjihuifu() {
        return shifouerjihuifu;
    }

    public void setShifouerjihuifu(Integer shifouerjihuifu) {
        this.shifouerjihuifu = shifouerjihuifu;
    }

    public Integer getBeihuifuid() {
        return beihuifuid;
    }

    public void setBeihuifuid(Integer beihuifuid) {
        this.beihuifuid = beihuifuid;
    }

    public Integer getErjihuifushu() {
        return erjihuifushu;
    }

    public void setErjihuifushu(Integer erjihuifushu) {
        this.erjihuifushu = erjihuifushu;
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

    public String getHuifuneirong() {
        return huifuneirong;
    }

    public void setHuifuneirong(String huifuneirong) {
        this.huifuneirong = huifuneirong == null ? null : huifuneirong.trim();
    }
}