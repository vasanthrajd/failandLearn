package com.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.utils.HibernateUtil;

public class Application {
	
	
	public static void main(String[] args) {
		
		try {
			
			Session session=HibernateUtil.getSession();
			 Transaction trx = session.beginTransaction();

			   Op_Invoice obj = (Op_Invoice) session.get(Op_Invoice.class, 2);

			   obj.setCustomerName("pr2453ps");
			  
			      session.saveOrUpdate(obj);
			    

			    trx.commit();
			    
			    
			    session.close();
			
		} catch (Exception e) {
	        e.printStackTrace();
		}

	}

}
