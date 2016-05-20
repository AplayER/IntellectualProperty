package com.hbippub.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class HbipPubOrder {
    private Integer dingdanid;

    private Integer shangpinid;

    private Integer maijiaid;

    private String maijiamingcheng;

    private Integer jiaoyileixingid;

    private Integer yonghuid;

    private Integer shangpinleixingid;

    private BigDecimal xiadanjiage;

    private Date xiadanshijian;

    private String dingdanzhuangtai;

    private String yonghumingcheng;

    private String shangpinmingcheng;

    private String lianxidianhua;

    private String tongxundizhi;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getDingdanid() {
        return dingdanid;
    }

    public void setDingdanid(Integer dingdanid) {
        this.dingdanid = dingdanid;
    }

    public Integer getShangpinid() {
        return shangpinid;
    }

    public void setShangpinid(Integer shangpinid) {
        this.shangpinid = shangpinid;
    }

    public Integer getMaijiaid() {
        return maijiaid;
    }

    public void setMaijiaid(Integer maijiaid) {
        this.maijiaid = maijiaid;
    }

    public String getMaijiamingcheng() {
        return maijiamingcheng;
    }

    public void setMaijiamingcheng(String maijiamingcheng) {
        this.maijiamingcheng = maijiamingcheng == null ? null : maijiamingcheng.trim();
    }

    public Integer getJiaoyileixingid() {
        return jiaoyileixingid;
    }

    public void setJiaoyileixingid(Integer jiaoyileixingid) {
        this.jiaoyileixingid = jiaoyileixingid;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public Integer getShangpinleixingid() {
        return shangpinleixingid;
    }

    public void setShangpinleixingid(Integer shangpinleixingid) {
        this.shangpinleixingid = shangpinleixingid;
    }

    public BigDecimal getXiadanjiage() {
        return xiadanjiage;
    }

    public void setXiadanjiage(BigDecimal xiadanjiage) {
        this.xiadanjiage = xiadanjiage;
    }

    public Date getXiadanshijian() {
        return xiadanshijian;
    }

    public void setXiadanshijian(Date xiadanshijian) {
        this.xiadanshijian = xiadanshijian;
    }

    public String getDingdanzhuangtai() {
        return dingdanzhuangtai;
    }

    public void setDingdanzhuangtai(String dingdanzhuangtai) {
        this.dingdanzhuangtai = dingdanzhuangtai == null ? null : dingdanzhuangtai.trim();
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

    public String getLianxidianhua() {
        return lianxidianhua;
    }

    public void setLianxidianhua(String lianxidianhua) {
        this.lianxidianhua = lianxidianhua == null ? null : lianxidianhua.trim();
    }

    public String getTongxundizhi() {
        return tongxundizhi;
    }

    public void setTongxundizhi(String tongxundizhi) {
        this.tongxundizhi = tongxundizhi == null ? null : tongxundizhi.trim();
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