package com.hbippub.pojo;

import java.util.Date;

public class HbipPubDiscussionReply {
    private Integer huifuid;

    private Integer tieziid;

    private Integer yonghuid;

    private String huifuneirong;

    private Date huifushijian;

    private String huifuzhexingming;

    private Integer shifouyishanchu;

    private String beizhu;

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

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public String getHuifuneirong() {
        return huifuneirong;
    }

    public void setHuifuneirong(String huifuneirong) {
        this.huifuneirong = huifuneirong == null ? null : huifuneirong.trim();
    }

    public Date getHuifushijian() {
        return huifushijian;
    }

    public void setHuifushijian(Date huifushijian) {
        this.huifushijian = huifushijian;
    }

    public String getHuifuzhexingming() {
        return huifuzhexingming;
    }

    public void setHuifuzhexingming(String huifuzhexingming) {
        this.huifuzhexingming = huifuzhexingming == null ? null : huifuzhexingming.trim();
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