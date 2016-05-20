package com.hbippub.pojo;

public class HbipPubLocation {
    private Integer diquid;

    private String diqumingcheng;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getDiquid() {
        return diquid;
    }

    public void setDiquid(Integer diquid) {
        this.diquid = diquid;
    }

    public String getDiqumingcheng() {
        return diqumingcheng;
    }

    public void setDiqumingcheng(String diqumingcheng) {
        this.diqumingcheng = diqumingcheng == null ? null : diqumingcheng.trim();
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