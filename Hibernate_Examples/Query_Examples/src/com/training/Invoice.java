package com.training;

public class Invoice {

	private int invNo;
	private String customer;
	private double invAmount;
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
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
