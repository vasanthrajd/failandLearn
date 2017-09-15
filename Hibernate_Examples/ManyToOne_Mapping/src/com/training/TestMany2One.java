package com.training;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class TestMany2One {

		public static void main(String[] args) {
	
			
			Session mySess = ( HibernateUtil.getSession());
			
			Transaction trns = mySess.beginTransaction();
			
			Address addr1 = new Address(301,"Gandhi St","Nehur Nagar","chennai","600008");
			Customer cust = new Customer(302,"ramesh",addr1);
			
			mySess.save(cust);
			
			trns.commit();
			
			HibernateUtil.commitAll();

		
       	}

}
