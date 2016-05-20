package com.hbippub.pojo;

public class HbipPubAdministrativeDivision {
    private Integer xingzhengquhuaid;

    private String xingzhengquhuaming;

    private String shangjilujing;

    private String wanzhenglujing;

    private String quhuadaima;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getXingzhengquhuaid() {
        return xingzhengquhuaid;
    }

    public void setXingzhengquhuaid(Integer xingzhengquhuaid) {
        this.xingzhengquhuaid = xingzhengquhuaid;
    }

    public String getXingzhengquhuaming() {
        return xingzhengquhuaming;
    }

    public void setXingzhengquhuaming(String xingzhengquhuaming) {
        this.xingzhengquhuaming = xingzhengquhuaming == null ? null : xingzhengquhuaming.trim();
    }

    public String getShangjilujing() {
        return shangjilujing;
    }

    public void setShangjilujing(String shangjilujing) {
        this.shangjilujing = shangjilujing == null ? null : shangjilujing.trim();
    }

    public String getWanzhenglujing() {
        return wanzhenglujing;
    }

    public void setWanzhenglujing(String wanzhenglujing) {
        this.wanzhenglujing = wanzhenglujing == null ? null : wanzhenglujing.trim();
    }

    public String getQuhuadaima() {
        return quhuadaima;
    }

    public void setQuhuadaima(String quhuadaima) {
        this.quhuadaima = quhuadaima == null ? null : quhuadaima.trim();
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