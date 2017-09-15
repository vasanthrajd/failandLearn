package com.training.tab.subclass;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.training.utils.HibernateUtil;



public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf=null;
		Session sess=null;
		
		 
			
		 sess = HibernateUtil.getSession();
		 
		 Transaction tx = sess.beginTransaction();
		 
	
		 Employee empObj = new Employee();
		 
		 empObj.setPersonId(101);
		 //empObj.setEmployeeId(101);
		 empObj.setPersonName("Ramesh");
		 empObj.setDeptName("java");
		 
		
				sess.save(empObj);
				sess.flush();
			
				try {
					tx.commit();
				} catch (HibernateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		
	}

}
