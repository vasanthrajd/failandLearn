package com.training.ano;
import org.hibernate.*;
import org.hibernate.cfg.*;

import com.training.QueryExamples;
import com.training.utils.HibernateUtil;

public class TestHiber_Annotation {

	
	public static void addData()
	{
		
		
    
		
	    Session sess = HibernateUtil.currentSession();
	 
	    Transaction tx = sess.beginTransaction();
	    
	    Employee pojo = new Employee();
	    pojo.setId(new Integer(5));
	    pojo.setName("XYZ");
	    
	    sess.save(pojo);
	    tx.commit();
	    System.out.println("Record Inserted");  
	    


	}

	
	public static void getData()
	{
	
		SessionFactory fact = new AnnotationConfiguration().configure().buildSessionFactory();

		Session sess = fact.openSession();
		 
	    Transaction tx = sess.beginTransaction();

	    Session sess1 = fact.openSession();
		 
	    Transaction tx1 = sess.beginTransaction();

	    Employee emp = (Employee)sess.get(Employee.class ,new Integer(5));
	    System.out.println(emp.getId());
	    
	    System.out.println(emp.getName());
	 
	    sess.close();
	   
	    Employee emp1 = (Employee)sess1.get(Employee.class ,new Integer(5));
	    System.out.println(emp1.getId());
	    
	    System.out.println(emp1.getName());
	    
	 
	    sess1.close();

	}
	
	
	
	public static void main(String[] args) {
	
              //addData();
		
		 QueryExamples obj=new QueryExamples();
		 
		  obj.callNamedQuery();
		 
		 
		 
}

}