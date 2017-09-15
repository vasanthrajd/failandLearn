package com.training.ano.tab.persubclass;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Ano_Booking")
@Inheritance(strategy=InheritanceType.JOINED)
public class Booking {

	
	private String customerName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingId;
	
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
}
