package com.training;
import org.hibernate.*;
import org.hibernate.cfg.*;

import com.fasterxml.classmate.AnnotationConfiguration;




public class TestOneToOne {

	static SessionFactory fact;
	static Session sess;
    static Transaction tx;
    
 
	static
	{
     fact = new AnnotationConfiguration().configure().buildSessionFactory();
		
	 sess = fact.openSession();
	 
	 tx = sess.beginTransaction();
	 
	}
	public static void addToTable()
	{
		
		   
	    CreditCard card = new CreditCard("visa",25000);
	    
	    Customer cust = new Customer("Ramesh",card );
	    
	    sess.save(cust);
	    
	    tx.commit();
	    
	    

	}
	
	public static void getFromTable()
	{
		
		 Customer cust2 = (Customer)sess.get(Customer.class,new Integer(6));
		 
		 System.out.println(cust2.getCustomerName());
		 System.out.println(cust2.getCard().getCardNumber());
		 System.out.println(cust2.getCard().getCardType());
		 System.out.println(cust2.getCard().getCreditLimit());
		 
		 
		 
		 
		 
		 
		 
		 
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	    
            addToTable();
	}

}
