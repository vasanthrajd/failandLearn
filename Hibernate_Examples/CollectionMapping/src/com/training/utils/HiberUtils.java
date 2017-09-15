package com.training.utils;
import org.hibernate.*;

import org.hibernate.cfg.*;
public class HiberUtils {

private static SessionFactory fact;
	
	public static  SessionFactory getSessionFactory()
	{
		fact =new Configuration().configure().buildSessionFactory();
		
		return fact;
	}
	
	public static void close()
	{
		fact.close();
	}
	
}
