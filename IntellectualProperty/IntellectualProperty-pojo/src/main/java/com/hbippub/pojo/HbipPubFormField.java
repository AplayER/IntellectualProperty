package com.hbippub.pojo;

public class HbipPubFormField extends HbipPubFormFieldKey {
    private Integer ziduanleixing;

    private Integer ziduanshunxu;

    private String ziduanmingcheng;

    private String ziduanshuju;

    private Integer shifouyishanchu;

    private String beizhu;

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

    public String getZiduanmingcheng() {
        return ziduanmingcheng;
    }

    public void setZiduanmingcheng(String ziduanmingcheng) {
        this.ziduanmingcheng = ziduanmingcheng == null ? null : ziduanmingcheng.trim();
    }

    public String getZiduanshuju() {
        return ziduanshuju;
    }

    public void setZiduanshuju(String ziduanshuju) {
        this.ziduanshuju = ziduanshuju == null ? null : ziduanshuju.trim();
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
}