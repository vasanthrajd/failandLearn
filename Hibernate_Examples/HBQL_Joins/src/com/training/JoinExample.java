package com.training;
import java.sql.SQLException;
import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class JoinExample {

	public static SessionFactory sf;
	public static Session sess;
	
	static
	{

		sf = new Configuration().configure().buildSessionFactory();
		
		sess = sf.openSession();
		
	}
	
	public void innerJoin()
	{
		
		
		 String hql = "select i.cust_id,i.cust_name,p.pol_name, p.pol_code from PolicyCodes  p inner join p.pol_code as i";
	        Query query = sess.createQuery(hql);
	        List results = query.list();
	        
	        Iterator itr = results.iterator();
	        
	        while(itr.hasNext())
	        {
	        	 Object[] obj = (Object[]) itr.next();
	             for (int i=0;i<obj.length;i++)
	             {
	                 System.out.println(obj[i]);
	             }
	        }
	}
}
