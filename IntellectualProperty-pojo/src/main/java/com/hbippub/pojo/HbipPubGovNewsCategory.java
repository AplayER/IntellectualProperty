package com.hbippub.pojo;

public class HbipPubGovNewsCategory {
    private Integer fenleiid;

    private String fenleiming;

    private Integer shunxuhao;

    private Integer shifouyishanchu;

    public Integer getFenleiid() {
        return fenleiid;
    }

    public void setFenleiid(Integer fenleiid) {
        this.fenleiid = fenleiid;
    }

    public String getFenleiming() {
        return fenleiming;
    }

    public void setFenleiming(String fenleiming) {
        this.fenleiming = fenleiming == null ? null : fenleiming.trim();
    }

    public Integer getShunxuhao() {
        return shunxuhao;
    }

    public void setShunxuhao(Integer shunxuhao) {
        this.shunxuhao = shunxuhao;
    }

    public Integer getShifouyishanchu() {
        return shifouyishanchu;
    }

    public void setShifouyishanchu(Integer shifouyishanchu) {
        this.shifouyishanchu = shifouyishanchu;
    }
}