package com.training;

public class Invoice {
	private int invNo;
	private String customer;
	private double invAmount;
	private Address billingAddress;
	private Address shippingAddress;
	public int getInvNo() {
		return invNo;
	}
	public void setInvNo(int invNo) {
		this.invNo = invNo;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public double getInvAmount() {
		return invAmount;
	}
	public void setInvAmount(double invAmount) {
		this.invAmount = invAmount;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
