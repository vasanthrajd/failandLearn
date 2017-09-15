package com.training;

public class Invoice {

	@Override
	public String toString() {
		
		return invno +":"+customerName+":"+amount;
	}
	private int invno;
	private String customerName;
    private double amount;
	public int getInvno() {
		return invno;
	}
	public void setInvno(int invno) {
		this.invno = invno;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Invoice(int invno, String customerName, double amount) {
		super();
		this.invno = invno;
		this.customerName = customerName;
		this.amount = amount;
	}
	public Invoice() {
		super();
	}
    
    
    
}
