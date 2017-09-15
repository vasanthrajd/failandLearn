package com.training.s1;

import java.util.logging.Logger;

public class Address {
private String addLine1;
private String addLine2;
private String city;
private String pinCode;
Logger log=Logger.getLogger(this.getClass().getName());
@Override
public String toString() {
	return "Address [addLine1=" + addLine1 + ", addLine2=" + addLine2
			+ ", city=" + city + ", pinCode=" + pinCode + ", getAddLine1()="
			+ getAddLine1() + ", getAddLine2()=" + getAddLine2()
			+ ", getCity()=" + getCity() + ", getPinCode()=" + getPinCode()
			+ "]";
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public String getAddLine1() {
	log.info(">>>>>>> Collaborated Class ");
	return addLine1;
}
public void setAddLine1(String addLine1) {
	this.addLine1 = addLine1;
}
public String getAddLine2() {
	return addLine2;
}
public void setAddLine2(String addLine2) {
	this.addLine2 = addLine2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPinCode() {
	return pinCode;
}
public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
}
	
}
