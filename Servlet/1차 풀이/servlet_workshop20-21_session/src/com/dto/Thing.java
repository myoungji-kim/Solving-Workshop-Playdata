package com.dto;

public class Thing {
	String tname;
	String tid;
	int tnum;

	Thing(){}
	
	public Thing(String tname, String tid, int tnum) {
		this.tname = tname;
		this.tid = tid;
		this.tnum = tnum;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public int getTnum() {
		return tnum;
	}

	public void setTnum(int tnum) {
		this.tnum = tnum;
	}

	@Override
	public String toString() {
		return "Thing [tname=" + tname + ", tid=" + tid + ", tnum=" + tnum + "]";
	}

	
}
