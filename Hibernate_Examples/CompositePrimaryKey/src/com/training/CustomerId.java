package com.training;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CustomerId implements Serializable {
	
	public CustomerId() {
		super();
		
	}
	private String countryCode;
	private String idCardNo;
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public CustomerId(String countryCode, String idCardNo) {
		super();
		this.countryCode = countryCode;
		this.idCardNo = idCardNo;
	}
	
	
	
}
