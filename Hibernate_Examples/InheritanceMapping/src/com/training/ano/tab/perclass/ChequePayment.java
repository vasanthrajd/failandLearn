package com.training.ano.tab.perclass;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@DiscriminatorValue(value="chq")

public class ChequePayment extends Payment {

	

	private long chequeNumber;
	private String bankName;
	
	public ChequePayment() {
		super();
		
	}

	public long getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(long chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "ChequePayment [chequeNumber=" + chequeNumber + ", bankName="
				+ bankName + "]"+super.toString();
	}
	
	
	
	
}
