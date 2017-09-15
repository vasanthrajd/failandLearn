package com.training;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;
@Entity
@Table(name="Batch_Invoice")
@OptimisticLocking(type=OptimisticLockType.DIRTY)
@DynamicUpdate(value=true)

public class Op_Invoice {

	@Override
	public String toString() {
		
		return invno +":"+customerName+":"+amount;
	}
	@Id
	@GeneratedValue
	private int invno;
	private String customerName;
    private double amount;
    @Version
    private long version;
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
	public Op_Invoice(int invno, String customerName, double amount) {
		super();
		this.invno = invno;
		this.customerName = customerName;
		this.amount = amount;
	}
	public Op_Invoice() {
		super();
	}
    
    
    
}
