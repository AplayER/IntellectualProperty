package com.hbippub.pojo;

import java.util.Date;

public class HbipPubReptileResult extends HbipPubReptileResultKey {
    private String wangzhi;

    private String wenzhangbiaoti;

    private Date fabiaoshijian;

    private String zuozhexingming;

    private String tupianurl;

    private Date paqushijian;

    private String beizhu;

    private String wenzhangneirong;

    public String getWangzhi() {
        return wangzhi;
    }

    public void setWangzhi(String wangzhi) {
        this.wangzhi = wangzhi == null ? null : wangzhi.trim();
    }

    public String getWenzhangbiaoti() {
        return wenzhangbiaoti;
    }

    public void setWenzhangbiaoti(String wenzhangbiaoti) {
        this.wenzhangbiaoti = wenzhangbiaoti == null ? null : wenzhangbiaoti.trim();
    }

    public Date getFabiaoshijian() {
        return fabiaoshijian;
    }

    public void setFabiaoshijian(Date fabiaoshijian) {
        this.fabiaoshijian = fabiaoshijian;
    }

    public String getZuozhexingming() {
        return zuozhexingming;
    }

    public void setZuozhexingming(String zuozhexingming) {
        this.zuozhexingming = zuozhexingming == null ? null : zuozhexingming.trim();
    }

    public String getTupianurl() {
        return tupianurl;
    }

    public void setTupianurl(String tupianurl) {
        this.tupianurl = tupianurl == null ? null : tupianurl.trim();
    }

    public Date getPaqushijian() {
        return paqushijian;
    }

    public void setPaqushijian(Date paqushijian) {
        this.paqushijian = paqushijian;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public String getWenzhangneirong() {
        return wenzhangneirong;
    }

    public void setWenzhangneirong(String wenzhangneirong) {
        this.wenzhangneirong = wenzhangneirong == null ? null : wenzhangneirong.trim();
    }
}