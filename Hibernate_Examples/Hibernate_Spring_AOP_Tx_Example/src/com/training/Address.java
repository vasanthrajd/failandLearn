package com.training;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Id
	private int userId;
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
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int userId, String street, String city, long pincode) {
		super();
		this.userId = userId;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	
}
