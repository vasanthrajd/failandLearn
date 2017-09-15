package com.training.utils;
import org.hibernate.*;
import org.hibernate.cfg.*;


public class HiberUtils {
	
	
	
	public static SessionFactory getHiberFactory()
	{
		
		 SessionFactory fact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 
		 return fact;
	}



}
