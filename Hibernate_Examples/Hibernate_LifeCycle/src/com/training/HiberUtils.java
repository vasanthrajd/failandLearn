package com.training;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class HiberUtils {

	private static SessionFactory fact;
	private static Session session;
	
	public static Session getHiberSession()
	{
		
		fact=new Configuration().configure("resource/hibernate.cfg.xml").buildSessionFactory();
				
		session=fact.openSession();
		
		return session;
	}
	
	public static void close()
	{
		
		session.close();
		fact.close();
		
	}
	
}
