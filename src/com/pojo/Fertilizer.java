package com.pojo;

// Generated May 10, 2019 2:49:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * Fertilizer generated by hbm2java
 */
public class Fertilizer implements java.io.Serializable {

	private Integer ferid;
	private String fername;
	private String ferdescription;
	private String ferrate;
	private String ferquantity;

	public Fertilizer() {
	}

	public Fertilizer(String fername, String ferdescription, String ferrate, String ferquantity) {
		this.fername = fername;
		this.ferdescription = ferdescription;
		this.ferrate = ferrate;
		this.ferquantity = ferquantity;
	}

	public Integer getFerid() {
		return this.ferid;
	}

	public void setFerid(Integer ferid) {
		this.ferid = ferid;
	}

	public String getFername() {
		return this.fername;
	}

	public void setFername(String fername) {
		this.fername = fername;
	}

	public String getFerdescription() {
		return this.ferdescription;
	}

	public void setFerdescription(String ferdescription) {
		this.ferdescription = ferdescription;
	}

	public String getFerrate() {
		return this.ferrate;
	}

	public void setFerrate(String ferrate) {
		this.ferrate = ferrate;
	}

	public String getFerquantity() {
		return this.ferquantity;
	}

	public void setFerquantity(String ferquantity) {
		this.ferquantity = ferquantity;
	}

}