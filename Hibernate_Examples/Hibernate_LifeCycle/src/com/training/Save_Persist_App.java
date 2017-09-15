package com.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.training.domains.Item;

public class Save_Persist_App {
	
	public static void main(String[] args) {
		
	
	SessionFactory fact=null;
	Session session=null;
	 Transaction tx;
	try {
		
		fact =new Configuration().configure("resource/hibernate.cfg.xml").buildSessionFactory();
		session=fact.openSession();
		tx=session.beginTransaction();
		
		  
		     
		        Item it2 = new Item(4129,"Butter Milk",304);
		    
		            Object id= session.save(it2);
		             
		        Item it3 = new Item(4229,"Pen Drive",452);
		    	
		        session.flush();
		        
		        session.persist(it3);
		       
		        session.flush();
		  			         
		     //tx.commit();
		    
		     
		
		    
	} catch (Exception e) {
          e.printStackTrace();
	}
	finally{
					
		fact.close();
	}
	}
}
