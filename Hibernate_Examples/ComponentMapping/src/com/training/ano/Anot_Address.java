package com.training.ano;

import javax.persistence.Embeddable;



@Embeddable
public class Anot_Address {

	private String street;
	private String city;
	private long pincode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public Anot_Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
