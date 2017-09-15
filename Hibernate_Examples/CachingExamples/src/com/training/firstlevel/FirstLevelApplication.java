package com.training.firstlevel;

import org.hibernate.*;
import org.hibernate.cfg.*;



public class FirstLevelApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
			Configuration configuration = new Configuration();
	         
	         configuration.configure("resources/hibernate.cfg.xml");
	         SessionFactory sf = configuration
	                         .buildSessionFactory();
	         Session session = sf.openSession();
			
			
			Employee  ob1 = (Employee)session.get(Employee.class, new Integer(5));
			 System.out.println(ob1);
			Employee  ob2 = (Employee)session.get(Employee.class, new Integer(5));
			System.out.println(ob2);
			Employee  ob3 = (Employee)session.get(Employee.class, new Integer(5));
			System.out.println(ob3);
			Employee  ob4 = (Employee)session.get(Employee.class, new Integer(5));
			System.out.println(ob4);
			 
			 
			session.clear();
		      //session.evict(ob2);
			 //session.close();
			
			 
			Session ses2 = sf.openSession();
			
			Object ob5 = ses2.get(Employee.class, new Integer(5));
			System.out.println(ob5);
          
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}

}
