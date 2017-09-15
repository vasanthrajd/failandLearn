package com.training.ano.tab.persubclass;


import org.hibernate.Transaction;

import org.hibernate.Session;

import com.training.utils.HibernateUtil;


public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Session hiberSession=HibernateUtil.getSession();
		
		
		       
		       
		       Transaction tx =hiberSession.beginTransaction();
		       
	
		       HotelBooking obj2=new HotelBooking();
		       
		          obj2.setBookingId(101);
		          obj2.setCustomerName("Ramesh");
		          obj2.setHotelType("3Star");
		          obj2.setLocation("Chennai");
		          obj2.setDaysBooked(2);
		          
		       
		               hiberSession.save(obj2);
		               
		               
		               tx.commit();
		       
		       

	}

}
