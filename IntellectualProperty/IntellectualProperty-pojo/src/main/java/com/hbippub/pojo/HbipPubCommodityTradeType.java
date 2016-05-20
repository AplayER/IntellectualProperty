package com.hbippub.pojo;

import java.math.BigDecimal;

public class HbipPubCommodityTradeType extends HbipPubCommodityTradeTypeKey {
    private BigDecimal cankaojia;

    private Integer shifouyishanchu;

    private String beizhu;

    public BigDecimal getCankaojia() {
        return cankaojia;
    }

    public void setCankaojia(BigDecimal cankaojia) {
        this.cankaojia = cankaojia;
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