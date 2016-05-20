package com.hbippub.pojo;

public class HbipPubMarketIndexPic {
    private Integer tupianid;

    private String shangpinurl;

    private String shangpinmingcheng;

    private String url;

    public Integer getTupianid() {
        return tupianid;
    }

    public void setTupianid(Integer tupianid) {
        this.tupianid = tupianid;
    }

    public String getShangpinurl() {
        return shangpinurl;
    }

    public void setShangpinurl(String shangpinurl) {
        this.shangpinurl = shangpinurl == null ? null : shangpinurl.trim();
    }

    public String getShangpinmingcheng() {
        return shangpinmingcheng;
    }

    public void setShangpinmingcheng(String shangpinmingcheng) {
        this.shangpinmingcheng = shangpinmingcheng == null ? null : shangpinmingcheng.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}