package com.hbippub.pojo;

public class HbipPubProjectField {
    private Integer ziduanid;

    private Integer tianxierenid;

    private String ziduanmingcheng;

    private Integer shifouyishanchu;

    private String beizhu;

    private Integer ziduanleixing;

    public Integer getZiduanid() {
        return ziduanid;
    }

    public void setZiduanid(Integer ziduanid) {
        this.ziduanid = ziduanid;
    }

    public Integer getTianxierenid() {
        return tianxierenid;
    }

    public void setTianxierenid(Integer tianxierenid) {
        this.tianxierenid = tianxierenid;
    }

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
}