package com.hbippub.pojo;

import java.util.Date;

public class HbipPubProjectAudit {
    private Integer shenheid;

    private Integer xiangmuid;

    private Integer yonghuid;

    private Date shenheshijian;

    private Integer shifouyishanchu;

    private String shenheneirong;

    private String beizhu;

    private String yonghuxingming;

    public Integer getShenheid() {
        return shenheid;
    }

    public void setShenheid(Integer shenheid) {
        this.shenheid = shenheid;
    }

    public Integer getXiangmuid() {
        return xiangmuid;
    }

    public void setXiangmuid(Integer xiangmuid) {
        this.xiangmuid = xiangmuid;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public Date getShenheshijian() {
        return shenheshijian;
    }

    public void setShenheshijian(Date shenheshijian) {
        this.shenheshijian = shenheshijian;
    }

    public Integer getShifouyishanchu() {
        return shifouyishanchu;
    }

    public void setShifouyishanchu(Integer shifouyishanchu) {
        this.shifouyishanchu = shifouyishanchu;
    }

    public String getShenheneirong() {
        return shenheneirong;
    }

    public void setShenheneirong(String shenheneirong) {
        this.shenheneirong = shenheneirong == null ? null : shenheneirong.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public String getYonghuxingming() {
        return yonghuxingming;
    }

    public void setYonghuxingming(String yonghuxingming) {
        this.yonghuxingming = yonghuxingming == null ? null : yonghuxingming.trim();
    }
}