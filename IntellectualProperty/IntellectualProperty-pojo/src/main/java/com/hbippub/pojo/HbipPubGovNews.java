package com.hbippub.pojo;

import java.util.Date;

public class HbipPubGovNews {
    private Integer xinwenid;

    private Integer faburenid;

    private Integer fenleiid;

    private String xinwenbiaoti;

    private Date fabushijian;

    private String fujianurl1;

    private String fujianurl2;

    private String fujianurl3;

    private String fujianurl4;

    private String fujianurl5;

    private Integer shifouyishanchu;

    private String xinwenneirong;

    public Integer getXinwenid() {
        return xinwenid;
    }

    public void setXinwenid(Integer xinwenid) {
        this.xinwenid = xinwenid;
    }

    public Integer getFaburenid() {
        return faburenid;
    }

    public void setFaburenid(Integer faburenid) {
        this.faburenid = faburenid;
    }

    public Integer getFenleiid() {
        return fenleiid;
    }

    public void setFenleiid(Integer fenleiid) {
        this.fenleiid = fenleiid;
    }

    public String getXinwenbiaoti() {
        return xinwenbiaoti;
    }

    public void setXinwenbiaoti(String xinwenbiaoti) {
        this.xinwenbiaoti = xinwenbiaoti == null ? null : xinwenbiaoti.trim();
    }

    public Date getFabushijian() {
        return fabushijian;
    }

    public void setFabushijian(Date fabushijian) {
        this.fabushijian = fabushijian;
    }

    public String getFujianurl1() {
        return fujianurl1;
    }

    public void setFujianurl1(String fujianurl1) {
        this.fujianurl1 = fujianurl1 == null ? null : fujianurl1.trim();
    }

    public String getFujianurl2() {
        return fujianurl2;
    }

    public void setFujianurl2(String fujianurl2) {
        this.fujianurl2 = fujianurl2 == null ? null : fujianurl2.trim();
    }

    public String getFujianurl3() {
        return fujianurl3;
    }

    public void setFujianurl3(String fujianurl3) {
        this.fujianurl3 = fujianurl3 == null ? null : fujianurl3.trim();
    }

    public String getFujianurl4() {
        return fujianurl4;
    }

    public void setFujianurl4(String fujianurl4) {
        this.fujianurl4 = fujianurl4 == null ? null : fujianurl4.trim();
    }

    public String getFujianurl5() {
        return fujianurl5;
    }

    public void setFujianurl5(String fujianurl5) {
        this.fujianurl5 = fujianurl5 == null ? null : fujianurl5.trim();
    }

    public Integer getShifouyishanchu() {
        return shifouyishanchu;
    }

    public void setShifouyishanchu(Integer shifouyishanchu) {
        this.shifouyishanchu = shifouyishanchu;
    }

    public String getXinwenneirong() {
        return xinwenneirong;
    }

    public void setXinwenneirong(String xinwenneirong) {
        this.xinwenneirong = xinwenneirong == null ? null : xinwenneirong.trim();
    }
}