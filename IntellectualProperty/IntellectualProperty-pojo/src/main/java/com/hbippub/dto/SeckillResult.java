/**
 * 
 */
package com.hbippub.dto;

/**
 * @author Peter
 *
 */
public class SeckillResult<T> {
	
	private boolean isSucceed;
	private T data;
	private String error;
	
	
	public SeckillResult(boolean isSucceed, T data) {
		super();
		this.isSucceed = isSucceed;
		this.data = data;
	}
	
	
	public SeckillResult(boolean isSucceed, String error) {
		super();
		this.isSucceed = isSucceed;
		this.error = error;
	}


	public boolean isSucceed() {
		return isSucceed;
	}
	public void setSucceed(boolean isSucceed) {
		this.isSucceed = isSucceed;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}

}
