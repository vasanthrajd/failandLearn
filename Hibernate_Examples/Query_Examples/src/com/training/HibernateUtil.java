package com.training;

import java.sql.SQLException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sf;
	private static Session mySession;
	private static Transaction tx;
	
	 public static final ThreadLocal th_session = new ThreadLocal();
	static
	{
         sf = new Configuration().configure().buildSessionFactory();
		
	     mySession = sf.openSession();
	     tx=mySession.beginTransaction();
		
	}
	
	public static Session getSession()
	{
		mySession = (Session) th_session.get();
       
        if (mySession == null) {
        	mySession = sf.openSession();
            // Store it in the ThreadLocal variable
            th_session.set(mySession);

	}
		return mySession; 
	}
	
	public static void commitAll()
	{
		
		try {
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		
	}
}
}