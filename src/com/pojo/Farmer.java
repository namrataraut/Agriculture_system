package com.pojo;

// Generated May 10, 2019 2:49:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * Farmer generated by hbm2java
 */
public class Farmer implements java.io.Serializable {

	private Integer fid;
	private String fname;
	private String fgender;
	private String femail;
	private String fusername;
	private String fpassword;
	private String country;

	public Farmer() {
	}

	public Farmer(String fname, String fgender, String femail, String fusername, String fpassword, String country) {
		this.fname = fname;
		this.fgender = fgender;
		this.femail = femail;
		this.fusername = fusername;
		this.fpassword = fpassword;
		this.country = country;
	}

	public Integer getFid() {
		return this.fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFgender() {
		return this.fgender;
	}

	public void setFgender(String fgender) {
		this.fgender = fgender;
	}

	public String getFemail() {
		return this.femail;
	}

	public void setFemail(String femail) {
		this.femail = femail;
	}

	public String getFusername() {
		return this.fusername;
	}

	public void setFusername(String fusername) {
		this.fusername = fusername;
	}

	public String getFpassword() {
		return this.fpassword;
	}

	public void setFpassword(String fpassword) {
		this.fpassword = fpassword;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
