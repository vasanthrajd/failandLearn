package com.training.ano.tab.perclass;


import org.hibernate.Transaction;

import org.hibernate.Session;

import com.training.utils.HibernateUtil;


public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Session hiberSession=HibernateUtil.getSession();
		
		
		ChequePayment obj=new ChequePayment();
		
		       obj.setCustomerId(987);
		       obj.setCustomerName("Raji");
		       obj.setBankName("citi");
		       obj.setAmount(4500);
		       obj.setChequeNumber(1010);
		       
		       
		       Transaction tx =hiberSession.beginTransaction();
		       
		       
		       CreditCardPayment obj2=new CreditCardPayment();
		       
		          obj2.setCustomerId(887);
		          obj2.setCustomerName("Ramesh");
		          obj2.setCardNumber(1010L);
		          obj2.setAmount(5500);
		          obj2.setCardProvider("visa");
		          obj2.setCurrencyType("INR");
		          
		       
		               hiberSession.save(obj2);
		               
		               
		               tx.commit();
		       
		       

	}

}
