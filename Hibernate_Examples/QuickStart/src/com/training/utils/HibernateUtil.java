package com.training.utils;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {

	private static final SessionFactory sf;
	private static Session mySession;
	
	
	static
	{
         Configuration configuration = new Configuration();
         
         configuration.configure("resources/hibernate.cfg.xml");
        
         sf = configuration.buildSessionFactory();
         mySession = sf.openSession();
		
	   
	}
	public static final ThreadLocal local = new ThreadLocal();
	
	public static Session currentSession()
	{Session s = (Session) local.get();
	if (s == null) {
		s = sf.openSession();
		local.set(s);
		}
		return s; 
	}
	
	public static void closeSession() throws HibernateException {
		Session s = (Session) local.get();
		local. set(null);
		if (s != null)
		s.close();
		}
}
