package com.training.one2Many;


import java.util.HashSet;
import java.util.Set;

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
		       
		     /*  Vendor v=new Vendor();
			      v.setVendorId(100);
			      v.setVendorName("java4s");
			      
			      Customers c1=new Customers();
			      c1.setCustomerId(500);
			      c1.setCustomerName("customer1");
			      
			      Customers c2=new Customers();
			      c2.setCustomerId(501);
			      c2.setCustomerName("customer2");
			      
			      Set s=new HashSet();
			      s.add(c1);
			      s.add(c2);*/
			      
			      //v.setChildren(s);
			      
			     // hiberSession.save(v);
			      

		       Student s1=new Student(205,"Rajesh");
		       Student s2=new Student(206,"Rakesh");
		       
		       Set s =new HashSet();
		        s.add(s1);
		        s.add(s2);
		        
		       Course obj=new Course(209,"java",s);
		       
		       
		       
		       
		               hiberSession.save(obj);
		               
		          
		               
		        /* Course crs =(Course)hiberSession.get(Course.class, 202);
		         
		         
		         System.out.println("Course Id"+crs.getCourse_id());
		         System.out.println("Curse Name"+crs.getCourse_name());
		         Set<Student> studList=crs.getStudentList();
		         System.out.println("Students");
		         for(Student s:studList)
		         {
		        	 System.out.println(s.getStudent_id());
		        	 System.out.println(s.getStudent_name());
		         }
		            */   
		               
		               
		               tx.commit();
		       
		       

	}

}
