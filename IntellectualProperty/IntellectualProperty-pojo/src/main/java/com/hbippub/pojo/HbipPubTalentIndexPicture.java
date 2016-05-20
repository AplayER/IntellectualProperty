package com.hbippub.pojo;

public class HbipPubTalentIndexPicture {
    private Integer tupianid;

    private Integer yonghuid;

    private String url;

    private String tupianmiaoshu;

    public Integer getTupianid() {
        return tupianid;
    }

    public void setTupianid(Integer tupianid) {
        this.tupianid = tupianid;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTupianmiaoshu() {
        return tupianmiaoshu;
    }

    public void setTupianmiaoshu(String tupianmiaoshu) {
        this.tupianmiaoshu = tupianmiaoshu == null ? null : tupianmiaoshu.trim();
    }
}