package com.hbippub.pojo;

import java.util.Date;

public class HbipPubCollectRecord {
    private Integer shoucangjiluid;

    private Integer yewuleixingid;

    private Integer shangpinid;

    private Integer yonghuid;

    private String yonghumingcheng;

    private String shangpinmingcheng;

    private Date shoucangshijian;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getShoucangjiluid() {
        return shoucangjiluid;
    }

    public void setShoucangjiluid(Integer shoucangjiluid) {
        this.shoucangjiluid = shoucangjiluid;
    }

    public Integer getYewuleixingid() {
        return yewuleixingid;
    }

    public void setYewuleixingid(Integer yewuleixingid) {
        this.yewuleixingid = yewuleixingid;
    }

    public Integer getShangpinid() {
        return shangpinid;
    }

    public void setShangpinid(Integer shangpinid) {
        this.shangpinid = shangpinid;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public String getYonghumingcheng() {
        return yonghumingcheng;
    }

    public void setYonghumingcheng(String yonghumingcheng) {
        this.yonghumingcheng = yonghumingcheng == null ? null : yonghumingcheng.trim();
    }

    public String getShangpinmingcheng() {
        return shangpinmingcheng;
    }

    public void setShangpinmingcheng(String shangpinmingcheng) {
        this.shangpinmingcheng = shangpinmingcheng == null ? null : shangpinmingcheng.trim();
    }

    public Date getShoucangshijian() {
        return shoucangshijian;
    }

    public void setShoucangshijian(Date shoucangshijian) {
        this.shoucangshijian = shoucangshijian;
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