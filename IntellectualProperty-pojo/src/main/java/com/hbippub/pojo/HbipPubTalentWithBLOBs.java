package com.hbippub.pojo;

public class HbipPubTalentWithBLOBs extends HbipPubTalent {
    private String xueshuzhuzuo;

    private String renzhiqingkuang;

    public String getXueshuzhuzuo() {
        return xueshuzhuzuo;
    }

    public void setXueshuzhuzuo(String xueshuzhuzuo) {
        this.xueshuzhuzuo = xueshuzhuzuo == null ? null : xueshuzhuzuo.trim();
    }

    public String getRenzhiqingkuang() {
        return renzhiqingkuang;
    }

    public void setRenzhiqingkuang(String renzhiqingkuang) {
        this.renzhiqingkuang = renzhiqingkuang == null ? null : renzhiqingkuang.trim();
    }
}