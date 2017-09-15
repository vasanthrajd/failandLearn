package com.training.apps;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.training.CreditCard;
import com.training.Customer;
import com.training.pojos.MutilCardCustomer;

public class OneToMany {

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
		
		   
	    CreditCard card1 = new CreditCard("visa",25000);
	    CreditCard card2 = new CreditCard("Master",35000);
	    
	    Set<CreditCard> cards = new HashSet<CreditCard>();
	    
	    cards.add(card1);
	    cards.add(card2);
	    
	    MutilCardCustomer cust = new MutilCardCustomer("Rakesh",cards);
	    
	    
	    sess.save(cust);
	    
	    tx.commit();
	    
	    

	}
	
	public static void getFromTable()
	{
		
		 Customer cust2 = (Customer)sess.get(Customer.class,new Integer(1));
		 
		 System.out.println(cust2.getCustomerName());
		 System.out.println(cust2.getCard().getCardNumber());
		 System.out.println(cust2.getCard().getCardType());
		 System.out.println(cust2.getCard().getCreditLimit());
		 
		 
		 
		 
		 
		 
		 
		 
		
	}
	public static void main(String[] args) {
		
		addToTable();

	}

}
