package com.training.ano;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Anot_Invoice")
public class Anot_Invoice {
	@Id
	private int invNo;
	private String customer;
	private double invAmount;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street" ,column=@Column(name="bill_street")),
	@AttributeOverride(name="city" ,column=@Column(name="bill_city")),
	@AttributeOverride(name="pincode" ,column=@Column(name="bill_pincode"))
	}
	)
	
	private Anot_Address billingAddress;
	
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street" ,column=@Column(name="ship_street")),
	@AttributeOverride(name="city" ,column=@Column(name="ship_city")),
	@AttributeOverride(name="pincode" ,column=@Column(name="ship_pincode"))
	}
	)
	
	private Anot_Address shippingAddress;
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
	
	public Anot_Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Anot_Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Anot_Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Anot_Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Anot_Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
