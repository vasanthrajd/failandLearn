package com.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.training.domains.Item;

public class Save_SaveOrUpdate {

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
			   
			    
			        Item it2 = new Item(209,"coolDrink",304);
			        
			        //if another object associated with the session has the same identifier, throw an exception

			        
			        /*session.saveOrUpdate(it2);*/  
			        
			        
			        
			        //if the object is already persistent in this session, do nothing

			     /* session.saveOrUpdate(it); */			        
			        
			        
			        //if the object has no identifier property, save() it

			                
			    /*    Item it3 = new Item(2109,"coolers",404);
			        
			        session.saveOrUpdate(it3)*/;
			        
			        
			  			         
			     tx.commit();
			    
			    System.out.println("Closing Session"+ session.close());
			   
			
			    
		} catch (Exception e) {
              e.printStackTrace();
		}
		finally{
						
			fact.close();
		}

	}




}
