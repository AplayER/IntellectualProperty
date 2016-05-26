/**
 * 
 */
package com.hbippub.pojo;

/**
 * @author 梁lab 806
 *
 */
public class SeckillExecution {
	private int seckillID;
	private int state;
	private String stateInfoString;
	private SuccessKilled successKilled;
	public SeckillExecution(int seckillID, int state, String stateInfoString,
			SuccessKilled successKilled) {
		super();
		this.seckillID = seckillID;
		this.state = state;
		this.stateInfoString = stateInfoString;
		this.successKilled = successKilled;
	}
	public SeckillExecution(int seckillID, int state, String stateInfoString) {
		super();
		this.seckillID = seckillID;
		this.state = state;
		this.stateInfoString = stateInfoString;
	}
	public int getSeckillID() {
		return seckillID;
	}
	public void setSeckillID(int seckillID) {
		this.seckillID = seckillID;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStateInfoString() {
		return stateInfoString;
	}
	public void setStateInfoString(String stateInfoString) {
		this.stateInfoString = stateInfoString;
	}
	public SuccessKilled getSuccessKilled() {
		return successKilled;
	}
	public void setSuccessKilled(SuccessKilled successKilled) {
		this.successKilled = successKilled;
	}
	

}
