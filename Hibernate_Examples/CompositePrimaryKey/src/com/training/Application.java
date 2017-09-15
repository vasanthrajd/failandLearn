package com.training;



import org.hibernate.Transaction;

import org.hibernate.Session;

import com.training.utils.HibernateUtil;


public class Application {

	public static void main(String[] args) {
		
		
		Session hiberSession=HibernateUtil.getSession();
		
				       
		       Transaction tx =hiberSession.beginTransaction();
		      		       
		       
		       
		       CustomerId custId=new CustomerId();
		           custId.setCountryCode("IND");
		           custId.setIdCardNo("2433");
		       
		           Customer cust=new Customer();
		           
		       cust.setId(custId);
		       cust.setFirstName("Rajesh");
		       cust.setLastName("Ramesh");
		       cust.setAddress("chennai");
		       cust.setEmail("abc@345.com");
		       
		       
		       
		     		       
				hiberSession.save(cust);
				
				Customer obj=(Customer)
				hiberSession.get
				     (Customer.class, new CustomerId("IND","1233"));
				
				System.out.println(obj);
				
				tx.commit();

				
			
		       
		       

	}

}
