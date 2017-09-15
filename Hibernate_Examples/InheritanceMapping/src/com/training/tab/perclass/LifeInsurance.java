package com.training.tab.perclass;

public class LifeInsurance extends Insurance {

	
	
	private double premiumAmount;
	private String paymentMode;
	
	public double getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public LifeInsurance( double premiumAmount,
			String paymentMode) {
		super();
		
		this.premiumAmount = premiumAmount;
		this.paymentMode = paymentMode;
	}
	public LifeInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LifeInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}
	
	
}
