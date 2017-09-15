package com.training;
import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="card_data")
public class CreditCard {
	
	
	private int cardNumber;
	private String cardType;
	private long creditLimit;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(int cardNumber, String cardType, long creditLimit) {
		super();
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.creditLimit = creditLimit;
	}
	
	@Id 
	@GeneratedValue(generator="gen")
	 @GenericGenerator(name="gen",strategy="foreign",parameters=@Parameter(name="property",value="customer"))
	 
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	@Column(name="card_type", nullable=false)
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	@Column(name="credit_limit",nullable=false)
	public long getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(long creditLimit) {
		this.creditLimit = creditLimit;
	}
	public CreditCard(String cardType, long creditLimit) {
		super();
		this.cardType = cardType;
		this.creditLimit = creditLimit;
	}
	
	
	

}
