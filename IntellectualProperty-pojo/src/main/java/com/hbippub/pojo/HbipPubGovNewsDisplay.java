package com.hbippub.pojo;

public class HbipPubGovNewsDisplay {
    private Integer erjifenleiid;

    private Integer xinwenid;

    private String xinwenmingcheng;

    private String neirong;

    public Integer getErjifenleiid() {
        return erjifenleiid;
    }

    public void setErjifenleiid(Integer erjifenleiid) {
        this.erjifenleiid = erjifenleiid;
    }

    public Integer getXinwenid() {
        return xinwenid;
    }

    public void setXinwenid(Integer xinwenid) {
        this.xinwenid = xinwenid;
    }

    public String getXinwenmingcheng() {
        return xinwenmingcheng;
    }

    public void setXinwenmingcheng(String xinwenmingcheng) {
        this.xinwenmingcheng = xinwenmingcheng == null ? null : xinwenmingcheng.trim();
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong == null ? null : neirong.trim();
    }
}