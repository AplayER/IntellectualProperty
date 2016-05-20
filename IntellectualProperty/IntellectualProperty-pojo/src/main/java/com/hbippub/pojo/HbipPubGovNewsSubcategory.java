package com.hbippub.pojo;

public class HbipPubGovNewsSubcategory {
    private Integer erjifenleiid;

    private Integer yijifenleiid;

    private String fenleiming;

    private Integer shunxuhao;

    private Integer shoucangshu;

    private Integer shifouyishanchu;

    public Integer getErjifenleiid() {
        return erjifenleiid;
    }

    public void setErjifenleiid(Integer erjifenleiid) {
        this.erjifenleiid = erjifenleiid;
    }

    public Integer getYijifenleiid() {
        return yijifenleiid;
    }

    public void setYijifenleiid(Integer yijifenleiid) {
        this.yijifenleiid = yijifenleiid;
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

    public Integer getShoucangshu() {
        return shoucangshu;
    }

    public void setShoucangshu(Integer shoucangshu) {
        this.shoucangshu = shoucangshu;
    }

    public Integer getShifouyishanchu() {
        return shifouyishanchu;
    }

    public void setShifouyishanchu(Integer shifouyishanchu) {
        this.shifouyishanchu = shifouyishanchu;
    }
}