package com.pojo;

// Generated May 10, 2019 2:49:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * Vegetables generated by hbm2java
 */
public class Vegetables implements java.io.Serializable {

	private Integer vegid;
	private String vegname;
	private String vegquantity;
	private String vegprice;
	private String state;
	private String city;

	public Vegetables() {
	}

	public Vegetables(String vegname, String vegquantity, String vegprice, String state, String city) {
		this.vegname = vegname;
		this.vegquantity = vegquantity;
		this.vegprice = vegprice;
		this.state = state;
		this.city = city;
	}

	public Integer getVegid() {
		return this.vegid;
	}

	public void setVegid(Integer vegid) {
		this.vegid = vegid;
	}

	public String getVegname() {
		return this.vegname;
	}

	public void setVegname(String vegname) {
		this.vegname = vegname;
	}

	public String getVegquantity() {
		return this.vegquantity;
	}

	public void setVegquantity(String vegquantity) {
		this.vegquantity = vegquantity;
	}

	public String getVegprice() {
		return this.vegprice;
	}

	public void setVegprice(String vegprice) {
		this.vegprice = vegprice;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}