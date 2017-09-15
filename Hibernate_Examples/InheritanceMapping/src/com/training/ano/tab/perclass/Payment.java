package com.training.ano.tab.perclass;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Table(name="Ano_Payment" )
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="paymentMode",
    discriminatorType=DiscriminatorType.STRING
)
@DiscriminatorValue(value="Pmt")

public  class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	private String   customerName;
	private double amount;
	private String currencyType;
	
	
	
	
	@Override
	public String toString() {
		return "Payment [customerId=" + customerId + ", customerName="
				+ customerName + ", amount=" + amount + ", currencyType="
				+ currencyType +" ]";
	}
	public Payment() {
		super();
	
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public String getCurrencyType() {
		return currencyType;
	}
	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}
//	public String getPaymentMode() {
//		return paymentMode;
//	}
//	public void setPaymentMode(String paymentMode) {
//		this.paymentMode = paymentMode;
	//}
	
	
	
}
