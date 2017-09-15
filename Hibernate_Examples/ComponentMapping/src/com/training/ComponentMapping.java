package com.training;

import java.sql.SQLException;

import org.hibernate.*;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.training.utils.HibernateUtil;


public class ComponentMapping {

	
	public void addData()
	{

		Address add1 = new Address();
		
		add1.setStreet("Nehru Street");
		add1.setCity("Bangaluru");
		add1.setPincode(65001);
		
		Invoice inv = new Invoice();
		
		inv.setInvNo(2001);
		inv.setBillingAddress(add1);
		inv.setCustomer("Magesh");
		inv.setInvAmount(25600);
	
		
	    Session session =HibernateUtil.getSession();
	    Transaction tx=session.beginTransaction();
	    session.save(inv);
	    tx.commit();
	    
	   
	}
	
	public void getData()
	{
	      Invoice invObj = 
	    	     
	    	    (Invoice)HibernateUtil.getSession().load(Invoice.class, 2001);
	      
	      System.out.println(invObj.getCustomer());
	      System.out.println(invObj.getBillingAddress().getCity());
	      
	      
	}
	
	public static void main(String[] args)
	{
	  ComponentMapping compObj = new ComponentMapping();
	   // compObj.addData();
	    compObj.getData();
	}
}
