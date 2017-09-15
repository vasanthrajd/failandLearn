package com.training;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name="CardCustomer")
public class Customer {

	
	private int customerId;
	private String customerName;
	private CreditCard card;
	
	@Id
	@GeneratedValue
	@Column(name="cust_id")
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Column(name="cust_name", length=20)
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@OneToOne(mappedBy="customer", cascade=CascadeType.ALL)
	public CreditCard getCard() {
		return card;
	}
	public void setCard(CreditCard card) {
		this.card = card;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, CreditCard card) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.card = card;
	}
	public Customer(String customerName, CreditCard card) {
		super();
		this.customerName = customerName;
		this.card = card;
	}
	
	
}
