package com.hbippub.pojo;

public class HbipPubMailbox {
    private Integer youxiangid;

    private String youxiangdizhi;

    private String youxiangmima;

    private Integer yonghuid;

    private Integer duankou;

    private String xieyi;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getYouxiangid() {
        return youxiangid;
    }

    public void setYouxiangid(Integer youxiangid) {
        this.youxiangid = youxiangid;
    }

    public String getYouxiangdizhi() {
        return youxiangdizhi;
    }

    public void setYouxiangdizhi(String youxiangdizhi) {
        this.youxiangdizhi = youxiangdizhi == null ? null : youxiangdizhi.trim();
    }

    public String getYouxiangmima() {
        return youxiangmima;
    }

    public void setYouxiangmima(String youxiangmima) {
        this.youxiangmima = youxiangmima == null ? null : youxiangmima.trim();
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public Integer getDuankou() {
        return duankou;
    }

    public void setDuankou(Integer duankou) {
        this.duankou = duankou;
    }

    public String getXieyi() {
        return xieyi;
    }

    public void setXieyi(String xieyi) {
        this.xieyi = xieyi == null ? null : xieyi.trim();
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