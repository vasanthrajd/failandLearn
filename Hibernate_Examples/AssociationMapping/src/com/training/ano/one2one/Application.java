package com.training.ano.one2one;


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
		      		       
		       Student  s = new Student();
				s.setStudentId(101);
				s.setStudentName("James");
				s.setGrp("mpc");
				
				Address  ad = new Address();
				ad.setAddressId(1);
				ad.setPlace("Carolina");
				
				ad.setParent(s);

		       
				hiberSession.save(ad);
				tx.commit();

				
			
		       
		       

	}

}
