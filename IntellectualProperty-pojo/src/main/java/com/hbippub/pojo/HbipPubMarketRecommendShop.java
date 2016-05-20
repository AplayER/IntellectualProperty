package com.hbippub.pojo;

public class HbipPubMarketRecommendShop {
    private Integer yonghuid;

    private String dianpumingcheng;

    private String dianputubiao;

    private String dianpujianjie;

    private String beizhu;

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public String getDianpumingcheng() {
        return dianpumingcheng;
    }

    public void setDianpumingcheng(String dianpumingcheng) {
        this.dianpumingcheng = dianpumingcheng == null ? null : dianpumingcheng.trim();
    }

    public String getDianputubiao() {
        return dianputubiao;
    }

    public void setDianputubiao(String dianputubiao) {
        this.dianputubiao = dianputubiao == null ? null : dianputubiao.trim();
    }

    public String getDianpujianjie() {
        return dianpujianjie;
    }

    public void setDianpujianjie(String dianpujianjie) {
        this.dianpujianjie = dianpujianjie == null ? null : dianpujianjie.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
}