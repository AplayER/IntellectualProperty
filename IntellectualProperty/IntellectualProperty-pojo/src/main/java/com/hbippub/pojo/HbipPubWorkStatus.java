package com.hbippub.pojo;

public class HbipPubWorkStatus {
    private Integer zhuangtaiid;

    private String gongzuozhuangtai;

    public Integer getZhuangtaiid() {
        return zhuangtaiid;
    }

    public void setZhuangtaiid(Integer zhuangtaiid) {
        this.zhuangtaiid = zhuangtaiid;
    }

    public String getGongzuozhuangtai() {
        return gongzuozhuangtai;
    }

    public void setGongzuozhuangtai(String gongzuozhuangtai) {
        this.gongzuozhuangtai = gongzuozhuangtai == null ? null : gongzuozhuangtai.trim();
    }
}