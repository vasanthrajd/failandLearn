package com.training;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sf;
	private static Session mySession;
	private static Transaction tx;
	
	static
	{
         Configuration cfg = new Configuration();
         
          cfg.addResource("resources/hibernate.cfg.xml");
         
          sf=cfg.buildSessionFactory();
		
	     mySession = sf.openSession();
		
	   
	}
	
	public static Session getSession()
	{
		return mySession; 
	}
	
	public static void commitAll()
	{
		mySession.flush(); 
		try {
			mySession.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
