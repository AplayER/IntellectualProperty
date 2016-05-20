package com.hbippub.pojo;

public class HbipPubRulesPostcode {
    private Integer guizeid;

    private String youbian;

    private String shengfenmingcheng;

    private String chengshimingcheng;

    public Integer getGuizeid() {
        return guizeid;
    }

    public void setGuizeid(Integer guizeid) {
        this.guizeid = guizeid;
    }

    public String getYoubian() {
        return youbian;
    }

    public void setYoubian(String youbian) {
        this.youbian = youbian == null ? null : youbian.trim();
    }

    public String getShengfenmingcheng() {
        return shengfenmingcheng;
    }

    public void setShengfenmingcheng(String shengfenmingcheng) {
        this.shengfenmingcheng = shengfenmingcheng == null ? null : shengfenmingcheng.trim();
    }

    public String getChengshimingcheng() {
        return chengshimingcheng;
    }

    public void setChengshimingcheng(String chengshimingcheng) {
        this.chengshimingcheng = chengshimingcheng == null ? null : chengshimingcheng.trim();
    }
}