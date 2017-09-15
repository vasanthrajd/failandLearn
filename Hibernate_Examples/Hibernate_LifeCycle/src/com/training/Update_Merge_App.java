package com.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.training.domains.Item;

public class Update_Merge_App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory fact=null;
		Session session=null;
		Transaction tx;
		try {
			
			fact =new Configuration().configure("resource/hibernate.cfg.xml").buildSessionFactory();
			session=fact.openSession();
			tx=session.beginTransaction();
			
			  
			    Item it =(Item)session.get(Item.class, 209);
			   
			    System.out.println("Got an Item "+ it);
			    
			    System.out.println("Closing Session"+ session.close());
			   
			    it.setRatePerUnit(153);
			    
			    Session session2 = fact.openSession();
			    
			    Item it2 =(Item)session2.get(Item.class, 209);
			    
			    // WILL THROW NOT UNIQUE OBJECT EXCEPTION
			          session2.update(it);
			          
			          // COMMENT THE ABOVE AND UNCOMMENT THE BELOW LINE AND OBSERVE THE OUTPUT
			    
			               //session2.merge(it);
			          
			         session2.beginTransaction().commit();
			    
		} catch (Exception e) {
              e.printStackTrace();
		}
		finally{
						
			fact.close();
		}

	}




}
