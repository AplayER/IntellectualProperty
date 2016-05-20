package com.hbippub.pojo;

public class HbipPubCity {
    private Integer chengshiid;

    private String chengshimingcheng;

    private String youbian;

    private Integer shunxuhao;

    public Integer getChengshiid() {
        return chengshiid;
    }

    public void setChengshiid(Integer chengshiid) {
        this.chengshiid = chengshiid;
    }

    public String getChengshimingcheng() {
        return chengshimingcheng;
    }

    public void setChengshimingcheng(String chengshimingcheng) {
        this.chengshimingcheng = chengshimingcheng == null ? null : chengshimingcheng.trim();
    }

    public String getYoubian() {
        return youbian;
    }

    public void setYoubian(String youbian) {
        this.youbian = youbian == null ? null : youbian.trim();
    }

    public Integer getShunxuhao() {
        return shunxuhao;
    }

    public void setShunxuhao(Integer shunxuhao) {
        this.shunxuhao = shunxuhao;
    }
}