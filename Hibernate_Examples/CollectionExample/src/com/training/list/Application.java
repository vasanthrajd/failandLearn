package com.training.list;



import java.util.Date;

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
		      		       
		       
		       
		       
		       Users u = new Users();
		        Certification c = new Certification();
		        c.setName("Java ");
		        c.setIssueDate(new Date());
		        c.setVerNumber("6.0");
		        
		        u.getCertifications().add(c);
	
		        
				
			
				 hiberSession.save(u);
				 
				tx.commit();
        
		       
		       

	}

}
