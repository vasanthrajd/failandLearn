package com.training.ano.tab.persubclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="Ano_HotelBooking")
@PrimaryKeyJoinColumn(name="bookingId")
public class HotelBooking extends Booking {

	
	
	private String hotelType;
	private String location;
	private int daysBooked;
	

	public String getHotelType() {
		return hotelType;
	}
	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getDaysBooked() {
		return daysBooked;
	}
	public void setDaysBooked(int daysBooked) {
		this.daysBooked = daysBooked;
	}
	public HotelBooking() {
		super();
		
	}
	
	
	
	
}
