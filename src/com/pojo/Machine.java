package com.pojo;

// Generated May 10, 2019 2:49:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * Machine generated by hbm2java
 */
public class Machine implements java.io.Serializable {

	private Integer mid;
	private String mname;
	private String mdescription;
	private String mimage;

	public Machine() {
	}

	public Machine(String mname, String mdescription, String mimage) {
		this.mname = mname;
		this.mdescription = mdescription;
		this.mimage = mimage;
	}

	public Integer getMid() {
		return this.mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getMname() {
		return this.mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMdescription() {
		return this.mdescription;
	}

	public void setMdescription(String mdescription) {
		this.mdescription = mdescription;
	}

	public String getMimage() {
		return this.mimage;
	}

	public void setMimage(String mimage) {
		this.mimage = mimage;
	}

}
