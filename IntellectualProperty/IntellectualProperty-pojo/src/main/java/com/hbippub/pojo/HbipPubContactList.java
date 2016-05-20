package com.hbippub.pojo;

import java.util.Date;

public class HbipPubContactList {
    private Integer tongxunluid;

    private Integer yonghuid;

    private String chuangjianzhexingming;

    private Date chuangjianshijian;

    private String tongxunlumingcheng;

    private Integer renshu;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getTongxunluid() {
        return tongxunluid;
    }

    public void setTongxunluid(Integer tongxunluid) {
        this.tongxunluid = tongxunluid;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public String getChuangjianzhexingming() {
        return chuangjianzhexingming;
    }

    public void setChuangjianzhexingming(String chuangjianzhexingming) {
        this.chuangjianzhexingming = chuangjianzhexingming == null ? null : chuangjianzhexingming.trim();
    }

    public Date getChuangjianshijian() {
        return chuangjianshijian;
    }

    public void setChuangjianshijian(Date chuangjianshijian) {
        this.chuangjianshijian = chuangjianshijian;
    }

    public String getTongxunlumingcheng() {
        return tongxunlumingcheng;
    }

    public void setTongxunlumingcheng(String tongxunlumingcheng) {
        this.tongxunlumingcheng = tongxunlumingcheng == null ? null : tongxunlumingcheng.trim();
    }

    public Integer getRenshu() {
        return renshu;
    }

    public void setRenshu(Integer renshu) {
        this.renshu = renshu;
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