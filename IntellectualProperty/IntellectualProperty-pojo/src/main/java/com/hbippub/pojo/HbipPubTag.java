package com.hbippub.pojo;

import java.util.Date;

public class HbipPubTag {
    private Integer biaoqianid;

    private String biaoqianneirong;

    private Date chuangjianshijian;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getBiaoqianid() {
        return biaoqianid;
    }

    public void setBiaoqianid(Integer biaoqianid) {
        this.biaoqianid = biaoqianid;
    }

    public String getBiaoqianneirong() {
        return biaoqianneirong;
    }

    public void setBiaoqianneirong(String biaoqianneirong) {
        this.biaoqianneirong = biaoqianneirong == null ? null : biaoqianneirong.trim();
    }

    public Date getChuangjianshijian() {
        return chuangjianshijian;
    }

    public void setChuangjianshijian(Date chuangjianshijian) {
        this.chuangjianshijian = chuangjianshijian;
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