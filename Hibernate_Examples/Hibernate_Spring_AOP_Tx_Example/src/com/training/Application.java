package com.training;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
	   SessionFactory fact =
			   new Configuration().configure().buildSessionFactory();

	     Session session = fact.openSession();
	     
	      
	     
	            Transaction tx =session.beginTransaction();   
	            
	            
	            		
	            		
	            		//session.save();
	            		
	            		tx.commit();
	            		
	               

	}

}
