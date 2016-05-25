package com.hbippub.pojo;

public class Exposer {
	private int seckillId;
	private boolean isExposed;
	private String md5;
	private long now;
	private long start;
	private long end;
	public Exposer(int seckillId, boolean isExposed, String md5) {
		super();
		this.seckillId = seckillId;
		this.isExposed = isExposed;
		this.md5 = md5;
	}
	public Exposer(boolean isExposed, long now, long start, long end) {
		super();
		this.isExposed = isExposed;
		this.now = now;
		this.start = start;
		this.end = end;
	}
	public Exposer(int seckillId, boolean isExposed) {
		super();
		this.seckillId = seckillId;
		this.isExposed = isExposed;
	}
	public int getSeckillId() {
		return seckillId;
	}
	public void setSeckillId(int seckillId) {
		this.seckillId = seckillId;
	}
	public boolean isExposed() {
		return isExposed;
	}
	public void setExposed(boolean isExposed) {
		this.isExposed = isExposed;
	}
	public String getMd5() {
		return md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}
	public long getNow() {
		return now;
	}
	public void setNow(long now) {
		this.now = now;
	}
	public long getStart() {
		return start;
	}
	public void setStart(long start) {
		this.start = start;
	}
	public long getEnd() {
		return end;
	}
	public void setEnd(long end) {
		this.end = end;
	}
	

}
