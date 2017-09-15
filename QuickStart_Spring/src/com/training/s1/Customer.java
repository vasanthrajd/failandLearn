package com.training.s1;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Customer {

	Logger log=Logger.getLogger(this.getClass().getName());

	private int customerNumber;
	private String customerName;
	private int customerHandphone;
	private Address addr;
	private ArrayList<String> a=new ArrayList<String>();
	
	
	
	
public ArrayList<String> getA() {
		return a;
	}

	public void setA(ArrayList<String> a) {
		a.add("vasanthraj");
		a.add("arul");
		a.add("thiyagu");
		this.a = a;
	}

@Override
public String toString() {
	return "Customer [customerNumber=" + customerNumber + ", customerName="
			+ customerName + ", customerHandphone=" + customerHandphone
			+ ", addr=" + addr + "]";
}

public Customer() {
	// TODO Auto-generated constructor stub
	super();
	log.info(">>>>>>> Default ");
}
public Customer(int customerNumber, String customerName, int customerHandphone) {
	super();
	this.customerNumber = customerNumber;
	this.customerName = customerName;
	this.customerHandphone = customerHandphone;
	log.info(">>>>>>> in cibsta ");
}
public int getCustomerNumber() {
	return customerNumber;
}
public void setCustomerNumber(int customerNumber) {
	log.info(">>>>>>> in set Cust Nuber ");
	this.customerNumber = customerNumber;
	
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	log.info(">>>>>>> in set Cust Name ");
	this.customerName = customerName;
	
}
public int getCustomerHandphone() {
	return customerHandphone;
}
public void setCustomerHandphone(int customerHandphone) {
	log.info(">>>>>>> in set Cust phone ");
	this.customerHandphone = customerHandphone;
	
}
public Address getAddr() {
	
	return addr;
}
public void setAddr(Address addr) {
	log.info(">>>>>>> in setting address phone ");
	this.addr = addr;
}
public String display(){
	return this.customerName+" : "+this.customerHandphone;
}
}
