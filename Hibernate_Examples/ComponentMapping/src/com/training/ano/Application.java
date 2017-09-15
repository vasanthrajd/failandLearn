package com.training.ano;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.training.utils.HibernateUtil;



public class Application {

	
	public static void main(String[] args) {
		
		
		
		
		   
		
		  Session session=HibernateUtil.getSession();
		  
		   Transaction tx=session.beginTransaction();
		   
		   /*Anot_Address add1 = new Anot_Address();
			
			add1.setStreet("Nehru Street");
			add1.setCity("Bangaluru");
			add1.setPincode(65001);
			
			Anot_Invoice inv = new Anot_Invoice();
			
			inv.setInvNo(2001);
			inv.setBillingAddress(add1);
			inv.setCustomer("Magesh");
			inv.setInvAmount(25600);
			
			session.persist(inv);*/
			
		   Image img = new Image("CAM", "Camera.jpg");
		   Image thumbImg = new Image("CAM", "Camera.gif");
		   
		      Catalog catObj =new Catalog(102,"Camera",img,thumbImg);
		      
		      
		       session.save(catObj);
		       
		       
		       
			tx.commit();
		  
		

	}

}
