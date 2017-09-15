package com.training;
import org.hibernate.*;
import org.hibernate.cfg.*;

import com.training.domains.Item;
public class Load_Get_Apps {

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
			
			  
			    Item it =(Item)session.get(Item.class, 201);
			    
			    System.out.println("================== GET =============");
			    
			    System.out.println("Returned Object "+ it.getClass());
			    
			    System.out.println("Item Name Using Method "+it.getItemName());
			    
			    System.out.println("Item Name using field "+it.itemName);
			
                
               System.out.println("================ LOAD ====================");
              
               Item it2 =(Item)session.load(Item.class, 201);
               
			    System.out.println("Returned Object"+ it2.getClass());
			    
			    System.out.println("Item Name Using Method"+it2.getItemName());
			    
			    System.out.println("Item Name using field "+it2.itemName);
			
			   
			   
			    
	               System.out.println("================ Over loaded LOAD ====================");
	               
	               Item it3=new Item();
				    
				    
				    session.load(it3, 102);
				    
				    System.out.println("Returned Object"+ it3.getClass());
				    
				    System.out.println("Item Name Using Method"+it3.getItemName());
				    
				    System.out.println("Item Name using field "+it3.itemName);
				
				
			    
		} catch (Exception e) {
              e.printStackTrace();
		}
		finally{
						
			fact.close();
		}

	}

}
