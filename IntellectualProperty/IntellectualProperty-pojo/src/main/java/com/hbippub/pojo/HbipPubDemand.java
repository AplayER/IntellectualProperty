package com.hbippub.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class HbipPubDemand {
    private Integer xuqiuid;

    private String xuqiumingcheng;

    private String shangpinleixingmingcheng;

    private Integer shangpinleixingid;

    private Integer shoucangshu;

    private Integer yonghuid;

    private String xingming;

    private Date fabushijian;

    private Date qiugoujiezhishijian;

    private BigDecimal yuqijiage;

    private String hangyeleixingmingcheng;

    private Integer shifouyishanchu;

    private String beizhu;

    private String qiugoushuoming;

    public Integer getXuqiuid() {
        return xuqiuid;
    }

    public void setXuqiuid(Integer xuqiuid) {
        this.xuqiuid = xuqiuid;
    }

    public String getXuqiumingcheng() {
        return xuqiumingcheng;
    }

    public void setXuqiumingcheng(String xuqiumingcheng) {
        this.xuqiumingcheng = xuqiumingcheng == null ? null : xuqiumingcheng.trim();
    }

    public String getShangpinleixingmingcheng() {
        return shangpinleixingmingcheng;
    }

    public void setShangpinleixingmingcheng(String shangpinleixingmingcheng) {
        this.shangpinleixingmingcheng = shangpinleixingmingcheng == null ? null : shangpinleixingmingcheng.trim();
    }

    public Integer getShangpinleixingid() {
        return shangpinleixingid;
    }

    public void setShangpinleixingid(Integer shangpinleixingid) {
        this.shangpinleixingid = shangpinleixingid;
    }

    public Integer getShoucangshu() {
        return shoucangshu;
    }

    public void setShoucangshu(Integer shoucangshu) {
        this.shoucangshu = shoucangshu;
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

    public Date getFabushijian() {
        return fabushijian;
    }

    public void setFabushijian(Date fabushijian) {
        this.fabushijian = fabushijian;
    }

    public Date getQiugoujiezhishijian() {
        return qiugoujiezhishijian;
    }

    public void setQiugoujiezhishijian(Date qiugoujiezhishijian) {
        this.qiugoujiezhishijian = qiugoujiezhishijian;
    }

    public BigDecimal getYuqijiage() {
        return yuqijiage;
    }

    public void setYuqijiage(BigDecimal yuqijiage) {
        this.yuqijiage = yuqijiage;
    }

    public String getHangyeleixingmingcheng() {
        return hangyeleixingmingcheng;
    }

    public void setHangyeleixingmingcheng(String hangyeleixingmingcheng) {
        this.hangyeleixingmingcheng = hangyeleixingmingcheng == null ? null : hangyeleixingmingcheng.trim();
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

    public String getQiugoushuoming() {
        return qiugoushuoming;
    }

    public void setQiugoushuoming(String qiugoushuoming) {
        this.qiugoushuoming = qiugoushuoming == null ? null : qiugoushuoming.trim();
    }
}