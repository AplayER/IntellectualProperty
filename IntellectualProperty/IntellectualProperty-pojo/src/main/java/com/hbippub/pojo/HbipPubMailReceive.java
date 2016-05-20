package com.hbippub.pojo;

import java.util.Date;

public class HbipPubMailReceive {
    private Integer bianhaoid;

    private Integer jieshourenid;

    private String jieshourenxingming;

    private String fajianrenxingming;

    private String youjianzhuti;

    private Integer youjianid;

    private Integer youjianleixing;

    private Integer youjianzhuangtai;

    private Integer shifouchaosong;

    private Integer shifoushanchu;

    private String beizhu;

    private Date shijian;

    public Integer getBianhaoid() {
        return bianhaoid;
    }

    public void setBianhaoid(Integer bianhaoid) {
        this.bianhaoid = bianhaoid;
    }

    public Integer getJieshourenid() {
        return jieshourenid;
    }

    public void setJieshourenid(Integer jieshourenid) {
        this.jieshourenid = jieshourenid;
    }

    public String getJieshourenxingming() {
        return jieshourenxingming;
    }

    public void setJieshourenxingming(String jieshourenxingming) {
        this.jieshourenxingming = jieshourenxingming == null ? null : jieshourenxingming.trim();
    }

    public String getFajianrenxingming() {
        return fajianrenxingming;
    }

    public void setFajianrenxingming(String fajianrenxingming) {
        this.fajianrenxingming = fajianrenxingming == null ? null : fajianrenxingming.trim();
    }

    public String getYoujianzhuti() {
        return youjianzhuti;
    }

    public void setYoujianzhuti(String youjianzhuti) {
        this.youjianzhuti = youjianzhuti == null ? null : youjianzhuti.trim();
    }

    public Integer getYoujianid() {
        return youjianid;
    }

    public void setYoujianid(Integer youjianid) {
        this.youjianid = youjianid;
    }

    public Integer getYoujianleixing() {
        return youjianleixing;
    }

    public void setYoujianleixing(Integer youjianleixing) {
        this.youjianleixing = youjianleixing;
    }

    public Integer getYoujianzhuangtai() {
        return youjianzhuangtai;
    }

    public void setYoujianzhuangtai(Integer youjianzhuangtai) {
        this.youjianzhuangtai = youjianzhuangtai;
    }

    public Integer getShifouchaosong() {
        return shifouchaosong;
    }

    public void setShifouchaosong(Integer shifouchaosong) {
        this.shifouchaosong = shifouchaosong;
    }

    public Integer getShifoushanchu() {
        return shifoushanchu;
    }

    public void setShifoushanchu(Integer shifoushanchu) {
        this.shifoushanchu = shifoushanchu;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public Date getShijian() {
        return shijian;
    }

    public void setShijian(Date shijian) {
        this.shijian = shijian;
    }
}