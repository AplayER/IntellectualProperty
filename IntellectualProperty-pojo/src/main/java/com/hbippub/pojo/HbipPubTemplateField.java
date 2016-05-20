package com.hbippub.pojo;

public class HbipPubTemplateField extends HbipPubTemplateFieldKey {
    private String ziduanmingcheng;

    private Integer shifouyishanchu;

    private String beizhu;

    private Integer ziduanleixing;

    private Integer ziduanshunxu;

    public String getZiduanmingcheng() {
        return ziduanmingcheng;
    }

    public void setZiduanmingcheng(String ziduanmingcheng) {
        this.ziduanmingcheng = ziduanmingcheng == null ? null : ziduanmingcheng.trim();
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

    public Integer getZiduanleixing() {
        return ziduanleixing;
    }

    public void setZiduanleixing(Integer ziduanleixing) {
        this.ziduanleixing = ziduanleixing;
    }

    public Integer getZiduanshunxu() {
        return ziduanshunxu;
    }

    public void setZiduanshunxu(Integer ziduanshunxu) {
        this.ziduanshunxu = ziduanshunxu;
    }
}