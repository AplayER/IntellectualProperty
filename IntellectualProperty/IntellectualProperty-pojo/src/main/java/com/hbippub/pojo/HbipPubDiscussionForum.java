package com.hbippub.pojo;

public class HbipPubDiscussionForum {
    private Integer taolunquid;

    private Integer taolunduixiangid;

    private Integer duixiangleibie;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getTaolunquid() {
        return taolunquid;
    }

    public void setTaolunquid(Integer taolunquid) {
        this.taolunquid = taolunquid;
    }

    public Integer getTaolunduixiangid() {
        return taolunduixiangid;
    }

    public void setTaolunduixiangid(Integer taolunduixiangid) {
        this.taolunduixiangid = taolunduixiangid;
    }

    public Integer getDuixiangleibie() {
        return duixiangleibie;
    }

    public void setDuixiangleibie(Integer duixiangleibie) {
        this.duixiangleibie = duixiangleibie;
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