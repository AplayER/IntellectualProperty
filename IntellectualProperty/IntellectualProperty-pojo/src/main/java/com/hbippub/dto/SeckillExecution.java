/**
 * 
 */
package com.hbippub.dto;

import com.hbippub.pojo.SuccessKilled;

/**
 * @author 梁lab 806
 *
 */
public class SeckillExecution {
	private int seckillId;
	private int state;
	private String stateInfo;
	private SuccessKilled successKilled;
	public SeckillExecution(int seckillId, int state, String stateInfo,
			SuccessKilled successKilled) {
		super();
		this.seckillId = seckillId;
		this.state = state;
		this.stateInfo = stateInfo;
		this.successKilled = successKilled;
	}
	public SeckillExecution(int seckillId, int state, String stateInfo) {
		super();
		this.seckillId = seckillId;
		this.state = state;
		this.stateInfo = stateInfo;
	}
	public int getSeckillId() {
		return seckillId;
	}
	public void setSeckillId(int seckillId) {
		this.seckillId = seckillId;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getstateInfo() {
		return stateInfo;
	}
	public void setstateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public SuccessKilled getSuccessKilled() {
		return successKilled;
	}
	public void setSuccessKilled(SuccessKilled successKilled) {
		this.successKilled = successKilled;
	}
	

}
