package com.hbippub.pojo;

public class HbipPubTechnologyMature {
    private Integer chengshuduid;

    private String chengshudumingcheng;

    private Integer shifouyishanchu;

    private String beizhu;

    public Integer getChengshuduid() {
        return chengshuduid;
    }

    public void setChengshuduid(Integer chengshuduid) {
        this.chengshuduid = chengshuduid;
    }

    public String getChengshudumingcheng() {
        return chengshudumingcheng;
    }

    public void setChengshudumingcheng(String chengshudumingcheng) {
        this.chengshudumingcheng = chengshudumingcheng == null ? null : chengshudumingcheng.trim();
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