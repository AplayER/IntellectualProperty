package com.hbippub.pojo;

import java.util.Date;

public class SuccessKilled extends SuccessKilledKey {
    @Override
	public String toString() {
		return "SuccessKilled [state=" + state + ", createTime=" + createTime
				+ ", seckill=" + seckill + "]";
	}

	private Byte state;

    private Date createTime;
    
    private Seckill seckill;

    public Seckill getSeckill() {
		return seckill;
	}

	public void setSeckill(Seckill seckill) {
		this.seckill = seckill;
	}

	public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}