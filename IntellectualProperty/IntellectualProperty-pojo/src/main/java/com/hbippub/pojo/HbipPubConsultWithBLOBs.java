package com.hbippub.pojo;

public class HbipPubConsultWithBLOBs extends HbipPubConsult {
    private String zixunneirong;

    private String huifuneirong;

    public String getZixunneirong() {
        return zixunneirong;
    }

    public void setZixunneirong(String zixunneirong) {
        this.zixunneirong = zixunneirong == null ? null : zixunneirong.trim();
    }

    public String getHuifuneirong() {
        return huifuneirong;
    }

    public void setHuifuneirong(String huifuneirong) {
        this.huifuneirong = huifuneirong == null ? null : huifuneirong.trim();
    }
}