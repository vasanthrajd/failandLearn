package com.training.pojos;

import java.util.ArrayList;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TestListMapping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		
		
		   Session sess = sf.openSession();
		
		   
		   
		   
			Training trngObj = new Training();
			 
			trngObj.setTrng_code(203);
			trngObj.setTrainer("Ramesh");
			trngObj.setLocation("pune");
		 		  
		  
		   
		   ArrayList list = new ArrayList();
	        list.add(new Participant(611,"Prakash"));
	        list.add(new Participant(711,"Irfan"));
	        
	        //trngObj.setParticipant(list);
	        

			   
	        org.hibernate.Transaction tx = sess.beginTransaction();
			
	        trngObj.getParticipant().add(new Participant(757,"Ganesh"));
	        trngObj.getParticipant().add(new Participant(4344,"Suresh"));
	        
		   
			    
			   sess.save(trngObj);
			   
			   tx.commit();
		   


	}

}
