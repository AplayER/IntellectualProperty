package com.hbippub.pojo;

public class HbipPubRecruitWithBLOBs extends HbipPubRecruit {
    private String zhiweimiaoshu;

    private String gongsijieshao;

    public String getZhiweimiaoshu() {
        return zhiweimiaoshu;
    }

    public void setZhiweimiaoshu(String zhiweimiaoshu) {
        this.zhiweimiaoshu = zhiweimiaoshu == null ? null : zhiweimiaoshu.trim();
    }

    public String getGongsijieshao() {
        return gongsijieshao;
    }

    public void setGongsijieshao(String gongsijieshao) {
        this.gongsijieshao = gongsijieshao == null ? null : gongsijieshao.trim();
    }
}