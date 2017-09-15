package com.training;

import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.utils.HibernateUtil;

public class ManageBatch {
	 
	   public static void main(String[] args) {
	
		   
		   
		   ManageBatch mObj = new ManageBatch();

	      
	      mObj.addEmployees( );
	   }
	  
	   
	   public void addEmployees( ){
	      Session session = HibernateUtil.getSession();
	      Transaction tx = null;
	     
	      try{
	         tx = session.beginTransaction();
	         for ( int i=0; i<10; i++ ) {
	            String cname = "custName " + i;
	            double amt =4500.00+ i;
	            
	            Invoice inv =new Invoice(i,cname,amt);
	            session.save(inv);
	         	/*if( i % 50 == 0 ) {
	               session.flush();
	               session.clear();
	            }*/
	         }
	         tx.commit();
	      }catch (Exception e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return ;
	   }
	   
	   public void updateEmployee()
	   {
		   Session session = HibernateUtil.getSession();
		   
		   Transaction tx = session.beginTransaction();

		   ScrollableResults invCursor = session.createQuery("from Invoice")
		                                      .scroll();
		   int count = 0;

		   while ( invCursor.next() ) {
		      Invoice inv = (Invoice) invCursor.get(0);
		     
		      session.update(inv); 
		      if ( ++count % 50 == 0 ) {
		         session.flush();
		         session.clear();
		      }
		   }
		   tx.commit();
		   session.close();
	   }
}
