package com.training.ano.tab.perconclass;


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
		       
		
		       TrainReservation obj2=new TrainReservation();
		       
		       obj2.setCustomerId(202);
		       obj2.setCustomerName("Ganesh");
		       obj2.setBoarding("CHN");
		       obj2.setDestination("SBC");
		       obj2.setPhoneNumber(100);
		       
		       
		       CarReservation obj =new CarReservation();
		       
		         obj.setCustomerId(204);
		         obj.setCustomerName("Gaurav");
		         obj.setVechileModel("Indica");
		         obj.setPhoneNumber(102);
		         obj.setVechileType("AC");
		       
		       
		               hiberSession.save(obj2);
		               hiberSession.save(obj);
		               
		               
		               tx.commit();
		       
		       

	}

}
