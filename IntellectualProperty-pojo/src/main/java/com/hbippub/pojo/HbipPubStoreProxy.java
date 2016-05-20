package com.hbippub.pojo;

import java.util.Date;

public class HbipPubStoreProxy {
    private Integer jiluid;

    private Integer dailirenid;

    private Integer dianzhuid;

    private Integer dailizhuangtai;

    private String dailirenmingcheng;

    private String dianzhumingcheng;

    private String dianpumingcheng;

    private Date shenqingshijian;

    private Date kaishishijian;

    private Date jieshushijian;

    public Integer getJiluid() {
        return jiluid;
    }

    public void setJiluid(Integer jiluid) {
        this.jiluid = jiluid;
    }

    public Integer getDailirenid() {
        return dailirenid;
    }

    public void setDailirenid(Integer dailirenid) {
        this.dailirenid = dailirenid;
    }

    public Integer getDianzhuid() {
        return dianzhuid;
    }

    public void setDianzhuid(Integer dianzhuid) {
        this.dianzhuid = dianzhuid;
    }

    public Integer getDailizhuangtai() {
        return dailizhuangtai;
    }

    public void setDailizhuangtai(Integer dailizhuangtai) {
        this.dailizhuangtai = dailizhuangtai;
    }

    public String getDailirenmingcheng() {
        return dailirenmingcheng;
    }

    public void setDailirenmingcheng(String dailirenmingcheng) {
        this.dailirenmingcheng = dailirenmingcheng == null ? null : dailirenmingcheng.trim();
    }

    public String getDianzhumingcheng() {
        return dianzhumingcheng;
    }

    public void setDianzhumingcheng(String dianzhumingcheng) {
        this.dianzhumingcheng = dianzhumingcheng == null ? null : dianzhumingcheng.trim();
    }

    public String getDianpumingcheng() {
        return dianpumingcheng;
    }

    public void setDianpumingcheng(String dianpumingcheng) {
        this.dianpumingcheng = dianpumingcheng == null ? null : dianpumingcheng.trim();
    }

    public Date getShenqingshijian() {
        return shenqingshijian;
    }

    public void setShenqingshijian(Date shenqingshijian) {
        this.shenqingshijian = shenqingshijian;
    }

    public Date getKaishishijian() {
        return kaishishijian;
    }

    public void setKaishishijian(Date kaishishijian) {
        this.kaishishijian = kaishishijian;
    }

    public Date getJieshushijian() {
        return jieshushijian;
    }

    public void setJieshushijian(Date jieshushijian) {
        this.jieshushijian = jieshushijian;
    }
}