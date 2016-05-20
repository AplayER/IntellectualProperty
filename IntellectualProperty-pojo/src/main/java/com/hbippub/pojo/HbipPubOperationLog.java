package com.hbippub.pojo;

import java.util.Date;

public class HbipPubOperationLog extends HbipPubOperationLogKey {
    private Integer mokuaiid;

    private Integer caozuorenid;

    private String caozuorenming;

    private String ipdizhi;

    private String mokuaiming;

    private String caozuoneirong;

    private String leiming;

    private String fangfaming;

    private Integer shifouchenggong;

    private Date caozuoshijian;

    private String beizhu;

    public Integer getMokuaiid() {
        return mokuaiid;
    }

    public void setMokuaiid(Integer mokuaiid) {
        this.mokuaiid = mokuaiid;
    }

    public Integer getCaozuorenid() {
        return caozuorenid;
    }

    public void setCaozuorenid(Integer caozuorenid) {
        this.caozuorenid = caozuorenid;
    }

    public String getCaozuorenming() {
        return caozuorenming;
    }

    public void setCaozuorenming(String caozuorenming) {
        this.caozuorenming = caozuorenming == null ? null : caozuorenming.trim();
    }

    public String getIpdizhi() {
        return ipdizhi;
    }

    public void setIpdizhi(String ipdizhi) {
        this.ipdizhi = ipdizhi == null ? null : ipdizhi.trim();
    }

    public String getMokuaiming() {
        return mokuaiming;
    }

    public void setMokuaiming(String mokuaiming) {
        this.mokuaiming = mokuaiming == null ? null : mokuaiming.trim();
    }

    public String getCaozuoneirong() {
        return caozuoneirong;
    }

    public void setCaozuoneirong(String caozuoneirong) {
        this.caozuoneirong = caozuoneirong == null ? null : caozuoneirong.trim();
    }

    public String getLeiming() {
        return leiming;
    }

    public void setLeiming(String leiming) {
        this.leiming = leiming == null ? null : leiming.trim();
    }

    public String getFangfaming() {
        return fangfaming;
    }

    public void setFangfaming(String fangfaming) {
        this.fangfaming = fangfaming == null ? null : fangfaming.trim();
    }

    public Integer getShifouchenggong() {
        return shifouchenggong;
    }

    public void setShifouchenggong(Integer shifouchenggong) {
        this.shifouchenggong = shifouchenggong;
    }

    public Date getCaozuoshijian() {
        return caozuoshijian;
    }

    public void setCaozuoshijian(Date caozuoshijian) {
        this.caozuoshijian = caozuoshijian;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
}