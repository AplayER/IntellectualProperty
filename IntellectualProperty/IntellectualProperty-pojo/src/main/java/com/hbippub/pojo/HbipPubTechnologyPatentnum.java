package com.hbippub.pojo;

public class HbipPubTechnologyPatentnum extends HbipPubTechnologyPatentnumKey {
    private Integer shifouyishanchu;

    private String beizhu;

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