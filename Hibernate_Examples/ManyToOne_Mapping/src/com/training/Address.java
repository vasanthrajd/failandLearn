package com.training;

public class Address {
	
	private int address_id;
	private String street;
	private String nagar;
	private String city;
	private String pincode;
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNagar() {
		return nagar;
	}
	public void setNagar(String nagar) {
		this.nagar = nagar;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int address_id, String street, String nagar, String city,
			String pincode) {
		super();
		this.address_id = address_id;
		this.street = street;
		this.nagar = nagar;
		this.city = city;
		this.pincode = pincode;
	}
	

}
