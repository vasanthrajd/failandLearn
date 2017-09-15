package com.training.ano.tab.perclass;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@DiscriminatorValue(value="crd")

public class CreditCardPayment extends Payment {

	
	private long  cardNumber;
	private String cardProvider;
	
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardProvider() {
		return cardProvider;
	}
	public void setCardProvider(String cardProvider) {
		this.cardProvider = cardProvider;
	}
	public CreditCardPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CreditCardPayment [cardNumber=" + cardNumber
				+ ", cardProvider=" + cardProvider + "]";
	}
	
	
	
}
