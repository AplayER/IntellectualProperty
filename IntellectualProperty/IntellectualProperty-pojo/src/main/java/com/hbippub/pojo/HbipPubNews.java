package com.hbippub.pojo;

import java.util.Date;

public class HbipPubNews {
    private Integer xinwenid;

    private Integer fabuzheid;

    private Integer fenleiid;

    private String xinwenmingcheng;

    private String xinxilaiyuan;

    private String fengmianurl;

    private Integer liulancishu;

    private Integer shifouzhiding;

    private Date fabushijian;

    private Date zhidingshijian;

    private Integer shifouyishanchu;

    private String neirong;

    public Integer getXinwenid() {
        return xinwenid;
    }

    public void setXinwenid(Integer xinwenid) {
        this.xinwenid = xinwenid;
    }

    public Integer getFabuzheid() {
        return fabuzheid;
    }

    public void setFabuzheid(Integer fabuzheid) {
        this.fabuzheid = fabuzheid;
    }

    public Integer getFenleiid() {
        return fenleiid;
    }

    public void setFenleiid(Integer fenleiid) {
        this.fenleiid = fenleiid;
    }

    public String getXinwenmingcheng() {
        return xinwenmingcheng;
    }

    public void setXinwenmingcheng(String xinwenmingcheng) {
        this.xinwenmingcheng = xinwenmingcheng == null ? null : xinwenmingcheng.trim();
    }

    public String getXinxilaiyuan() {
        return xinxilaiyuan;
    }

    public void setXinxilaiyuan(String xinxilaiyuan) {
        this.xinxilaiyuan = xinxilaiyuan == null ? null : xinxilaiyuan.trim();
    }

    public String getFengmianurl() {
        return fengmianurl;
    }

    public void setFengmianurl(String fengmianurl) {
        this.fengmianurl = fengmianurl == null ? null : fengmianurl.trim();
    }

    public Integer getLiulancishu() {
        return liulancishu;
    }

    public void setLiulancishu(Integer liulancishu) {
        this.liulancishu = liulancishu;
    }

    public Integer getShifouzhiding() {
        return shifouzhiding;
    }

    public void setShifouzhiding(Integer shifouzhiding) {
        this.shifouzhiding = shifouzhiding;
    }

    public Date getFabushijian() {
        return fabushijian;
    }

    public void setFabushijian(Date fabushijian) {
        this.fabushijian = fabushijian;
    }

    public Date getZhidingshijian() {
        return zhidingshijian;
    }

    public void setZhidingshijian(Date zhidingshijian) {
        this.zhidingshijian = zhidingshijian;
    }

    public Integer getShifouyishanchu() {
        return shifouyishanchu;
    }

    public void setShifouyishanchu(Integer shifouyishanchu) {
        this.shifouyishanchu = shifouyishanchu;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong == null ? null : neirong.trim();
    }
}