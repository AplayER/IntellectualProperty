package com.hbippub.pojo;

import java.util.Date;

public class HbipPubBlacklist {
    private Integer jiluid;

    private Integer yonghuid;

    private String xingming;

    private Integer biaoji;

    private Integer chulirenid;

    private String jiaruliyou;

    private Date jiarushijian;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getJiluid() {
        return jiluid;
    }

    public void setJiluid(Integer jiluid) {
        this.jiluid = jiluid;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming == null ? null : xingming.trim();
    }

    public Integer getBiaoji() {
        return biaoji;
    }

    public void setBiaoji(Integer biaoji) {
        this.biaoji = biaoji;
    }

    public Integer getChulirenid() {
        return chulirenid;
    }

    public void setChulirenid(Integer chulirenid) {
        this.chulirenid = chulirenid;
    }

    public String getJiaruliyou() {
        return jiaruliyou;
    }

    public void setJiaruliyou(String jiaruliyou) {
        this.jiaruliyou = jiaruliyou == null ? null : jiaruliyou.trim();
    }

    public Date getJiarushijian() {
        return jiarushijian;
    }

    public void setJiarushijian(Date jiarushijian) {
        this.jiarushijian = jiarushijian;
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