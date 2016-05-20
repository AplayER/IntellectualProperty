package com.hbippub.pojo;

import java.util.Date;

public class HbipPubConsult {
    private Integer zixunid;

    private Integer zixunzheid;

    private String zixunzhexingming;

    private Date zixunshijian;

    private Integer huifuzheid;

    private String huifuzhexingming;

    private Date huifushijian;

    private Integer shifouyidu;

    public Integer getZixunid() {
        return zixunid;
    }

    public void setZixunid(Integer zixunid) {
        this.zixunid = zixunid;
    }

    public Integer getZixunzheid() {
        return zixunzheid;
    }

    public void setZixunzheid(Integer zixunzheid) {
        this.zixunzheid = zixunzheid;
    }

    public String getZixunzhexingming() {
        return zixunzhexingming;
    }

    public void setZixunzhexingming(String zixunzhexingming) {
        this.zixunzhexingming = zixunzhexingming == null ? null : zixunzhexingming.trim();
    }

    public Date getZixunshijian() {
        return zixunshijian;
    }

    public void setZixunshijian(Date zixunshijian) {
        this.zixunshijian = zixunshijian;
    }

    public Integer getHuifuzheid() {
        return huifuzheid;
    }

    public void setHuifuzheid(Integer huifuzheid) {
        this.huifuzheid = huifuzheid;
    }

    public String getHuifuzhexingming() {
        return huifuzhexingming;
    }

    public void setHuifuzhexingming(String huifuzhexingming) {
        this.huifuzhexingming = huifuzhexingming == null ? null : huifuzhexingming.trim();
    }

    public Date getHuifushijian() {
        return huifushijian;
    }

    public void setHuifushijian(Date huifushijian) {
        this.huifushijian = huifushijian;
    }

    public Integer getShifouyidu() {
        return shifouyidu;
    }

    public void setShifouyidu(Integer shifouyidu) {
        this.shifouyidu = shifouyidu;
    }
}