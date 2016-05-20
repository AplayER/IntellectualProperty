package com.hbippub.pojo;

public class HbipPubMailContactGroup {
    private Integer fenzuid;

    private Integer yonghuid;

    private String fenzumingcheng;

    private Integer shifoushanchu;

    private String beizhu;

    public Integer getFenzuid() {
        return fenzuid;
    }

    public void setFenzuid(Integer fenzuid) {
        this.fenzuid = fenzuid;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public String getFenzumingcheng() {
        return fenzumingcheng;
    }

    public void setFenzumingcheng(String fenzumingcheng) {
        this.fenzumingcheng = fenzumingcheng == null ? null : fenzumingcheng.trim();
    }

    public Integer getShifoushanchu() {
        return shifoushanchu;
    }

    public void setShifoushanchu(Integer shifoushanchu) {
        this.shifoushanchu = shifoushanchu;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
}