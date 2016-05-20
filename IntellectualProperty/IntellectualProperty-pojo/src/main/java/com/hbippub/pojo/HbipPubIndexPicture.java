package com.hbippub.pojo;

public class HbipPubIndexPicture {
    private Integer tupianid;

    private Integer yonghuid;

    private String url;

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
}