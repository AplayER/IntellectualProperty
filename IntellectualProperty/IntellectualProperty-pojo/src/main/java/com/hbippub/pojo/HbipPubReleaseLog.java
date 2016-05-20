package com.hbippub.pojo;

import java.util.Date;

public class HbipPubReleaseLog {
    private Integer rizhiid;

    private Integer jiluid;

    private Integer leixingid;

    private Integer faburenid;

    private String faburenxingming;

    private String jilumingcheng;

    private String jiluxiangqing;

    private Date fabushijian;

    private String touxiangurl;

    private String jiluurl;

    private Integer shifouyishanchu;

    public Integer getRizhiid() {
        return rizhiid;
    }

    public void setRizhiid(Integer rizhiid) {
        this.rizhiid = rizhiid;
    }

    public Integer getJiluid() {
        return jiluid;
    }

    public void setJiluid(Integer jiluid) {
        this.jiluid = jiluid;
    }

    public Integer getLeixingid() {
        return leixingid;
    }

    public void setLeixingid(Integer leixingid) {
        this.leixingid = leixingid;
    }

    public Integer getFaburenid() {
        return faburenid;
    }

    public void setFaburenid(Integer faburenid) {
        this.faburenid = faburenid;
    }

    public String getFaburenxingming() {
        return faburenxingming;
    }

    public void setFaburenxingming(String faburenxingming) {
        this.faburenxingming = faburenxingming == null ? null : faburenxingming.trim();
    }

    public String getJilumingcheng() {
        return jilumingcheng;
    }

    public void setJilumingcheng(String jilumingcheng) {
        this.jilumingcheng = jilumingcheng == null ? null : jilumingcheng.trim();
    }

    public String getJiluxiangqing() {
        return jiluxiangqing;
    }

    public void setJiluxiangqing(String jiluxiangqing) {
        this.jiluxiangqing = jiluxiangqing == null ? null : jiluxiangqing.trim();
    }

    public Date getFabushijian() {
        return fabushijian;
    }

    public void setFabushijian(Date fabushijian) {
        this.fabushijian = fabushijian;
    }

    public String getTouxiangurl() {
        return touxiangurl;
    }

    public void setTouxiangurl(String touxiangurl) {
        this.touxiangurl = touxiangurl == null ? null : touxiangurl.trim();
    }

    public String getJiluurl() {
        return jiluurl;
    }

    public void setJiluurl(String jiluurl) {
        this.jiluurl = jiluurl == null ? null : jiluurl.trim();
    }

    public Integer getShifouyishanchu() {
        return shifouyishanchu;
    }

    public void setShifouyishanchu(Integer shifouyishanchu) {
        this.shifouyishanchu = shifouyishanchu;
    }
}