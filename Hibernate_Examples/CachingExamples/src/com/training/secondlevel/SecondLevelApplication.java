package com.training.secondlevel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class SecondLevelApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
			Configuration configuration = new Configuration();
	         
	         configuration.configure("resources/hibernate.cfg.xml");
	         
	         SessionFactory sf = configuration
	                         .buildSessionFactory();
	         Session session1 = sf.openSession();
			
			Transaction tx = session1.beginTransaction();
	        
	         
	         
	         Object o=session1.load(Employee.class,new Integer(5));
	         
	         Employee s=(Employee)o;
	         System.out.println("Loaded object product name is:"+s.getEmpName());
	         
	         
	         // change cache usage to read-write and observe the result
	         
	         s.setEmpName("Mr.Kum");
	         session1.update(s);
	          tx.commit();
	         
	          
	         session1.close();

	         
	  
	         System.out.println("---------session Closed-------------");
	         System.out.println("Waiting......");
	  
	         try{
	             Thread.sleep(6000);
	         }
	         catch (Exception e) {
	         }      
	  
	         System.out.println("6 seconds compelted......!!!!!!!!");
	  
	 
	         Session session2 = sf.openSession();
	         Object o2=session2.load(Employee.class,new Integer(5));
	  
	         Employee s2=(Employee)o2;
	         System.out.println("Loaded object" +
	         		" From New Session From Database"+s2.getEmpName());
	      
	         
	         session2.close();
	           System.out.println("Session Closed and New Opened---!");
	         Session session3 = sf.openSession();
	         Object o3=session3.load(Employee.class,new Integer(5));
	  
	         Employee s3=(Employee)o3;
	         System.out.println("Loaded object From Gloabl Cache"
	        		   +s3.getEmpName());
	         
	         session3.close();
	  
	         sf.close();

			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}

}
