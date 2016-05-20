package com.hbippub.pojo;

public class HbipPubCourse {
    private Integer kechengid;

    private String kechengming;

    private String jiaoshixingming;

    private Float xuefen;

    public Integer getKechengid() {
        return kechengid;
    }

    public void setKechengid(Integer kechengid) {
        this.kechengid = kechengid;
    }

    public String getKechengming() {
        return kechengming;
    }

    public void setKechengming(String kechengming) {
        this.kechengming = kechengming == null ? null : kechengming.trim();
    }

    public String getJiaoshixingming() {
        return jiaoshixingming;
    }

    public void setJiaoshixingming(String jiaoshixingming) {
        this.jiaoshixingming = jiaoshixingming == null ? null : jiaoshixingming.trim();
    }

    public Float getXuefen() {
        return xuefen;
    }

    public void setXuefen(Float xuefen) {
        this.xuefen = xuefen;
    }
}