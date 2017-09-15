
package com.training;


import java.sql.SQLException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sf;
	private static Session mySession;
	
	static
	{
         sf = new Configuration().configure().buildSessionFactory();
		
	     mySession = sf.openSession();
		
	}
	
	public static Session getSession()
	{
		return mySession; 
	}
	
	public static void commitAll()
	{
		 
		try {
			mySession.beginTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
