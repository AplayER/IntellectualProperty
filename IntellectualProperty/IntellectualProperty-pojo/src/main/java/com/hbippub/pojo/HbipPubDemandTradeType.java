package com.hbippub.pojo;

import java.math.BigDecimal;

public class HbipPubDemandTradeType extends HbipPubDemandTradeTypeKey {
    private BigDecimal yuqijiage;

    private Integer shifouyishanchu;

    private String beizhu;

    public BigDecimal getYuqijiage() {
        return yuqijiage;
    }

    public void setYuqijiage(BigDecimal yuqijiage) {
        this.yuqijiage = yuqijiage;
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