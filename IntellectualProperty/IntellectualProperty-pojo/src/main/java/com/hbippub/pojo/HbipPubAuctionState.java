package com.hbippub.pojo;

public class HbipPubAuctionState {
    private Integer paimaizhuangtaiid;

    private String zhuangtaimingcheng;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getPaimaizhuangtaiid() {
        return paimaizhuangtaiid;
    }

    public void setPaimaizhuangtaiid(Integer paimaizhuangtaiid) {
        this.paimaizhuangtaiid = paimaizhuangtaiid;
    }

    public String getZhuangtaimingcheng() {
        return zhuangtaimingcheng;
    }

    public void setZhuangtaimingcheng(String zhuangtaimingcheng) {
        this.zhuangtaimingcheng = zhuangtaimingcheng == null ? null : zhuangtaimingcheng.trim();
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