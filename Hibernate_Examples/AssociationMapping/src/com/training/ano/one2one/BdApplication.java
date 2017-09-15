package com.training.ano.one2one;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Transaction;

import org.hibernate.Session;

import com.training.utils.HibernateUtil;


public class BdApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Session hiberSession=HibernateUtil.getSession();
		
		
		       
		       
		       Transaction tx =hiberSession.beginTransaction();
		      		       
		       BdStudent  s = new BdStudent();
				s.setStudentId(401);
				s.setStudentName("James");
				s.setGrp("mpc");
			
				BdAddress  ad = new BdAddress();
				ad.setAddressId(4);
				ad.setPlace("Carolina");
				
				s.setAddr(ad);
			    ad.setParent(s);

		       
				//hiberSession.save(ad);
				tx.commit();

				
				BdStudent obj =(BdStudent)hiberSession.get(BdStudent.class,401);
				
				System.out.println(obj.getStudentId());
				System.out.println(obj.getStudentName());
				System.out.println(obj.getAddr().getPlace());
				
				
				BdAddress obj2 =(BdAddress)hiberSession.get(BdAddress.class, 4);
				
				System.out.println(obj2.getAddressId());
				System.out.println(obj2.getParent().getStudentName());
				
				
				
			
		       
		       

	}

}
