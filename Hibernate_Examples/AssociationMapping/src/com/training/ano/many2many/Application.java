package com.training.ano.many2many;


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
		      		       
		       
		       
		       
		       Categories c1 = new Categories();
				c1.setCategoryId(1);
				c1.setCategoryName("cat 1");
				
				Categories c2=new Categories();
				c2.setCategoryId(2);
				c2.setCategoryName("cat 2");
				
				Item i1=new Item();
				Item i2 = new Item();
				
				i1.setItemId(101);
				i1.setItemName("item1");
				
				i2.setItemId(102);
				i2.setItemName("item2");
				
				Set  s =new HashSet();
				s.add(i1);
				s.add(i2);
				
				c1.setItems(s);
				c2.setItems(s);
				
			
				 hiberSession.save(c1);
				 hiberSession.save(c2);
				tx.commit();
        
		       
		       

	}

}
