package com.training;
import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class MyQueries {
	
	
	public List<Invoice> displayAll()
	{
		
		List<Invoice> invList = 
       			HibernateUtil.getSession().createQuery("from Invoice").list();

		return invList;
		
	}
	
	public void selectQuery()
	{
		Session mySess = HibernateUtil.getSession();
		
		Query qry =mySess.createQuery("select invNo,customer from Invoice");
		
		List myList = qry.list();
		
		for(int i =0;i<myList.size();i++)
		{
			Object[] obj = (Object[]) myList.get(i);
			
			System.out.println(obj[0]);
			System.out.println(obj[1]);
		}
		
		
		 
		
	}
	public void displayList(List<Invoice> invList)
	{
		
		Iterator<Invoice> itr = invList.iterator();
		
		while(itr.hasNext())
		{
			
			Invoice inv = itr.next();
			
			System.out.println(inv.getInvNo() +"\t" +inv.getCustomer() +"\t"+inv.getInvAmount());
		}
		
		
	}

	public void  useWhereClause()
	{
		
	Session sess  =  HibernateUtil.getSession();
	 
			Query qry =  sess.createQuery("from Invoice where invNo=:ino");
			 
			qry.setInteger("ino", 1001);
		    
			Invoice inv = (Invoice)qry.uniqueResult();
		    
		    System.out.println(inv.getCustomer()+"\t"+inv.getInvAmount());
		    
	}
	
	public void useNativeQuery()
	{
		
		Session sess = HibernateUtil.getSession();
		
		// invoice - Denotes the Table Name and not Class Name
		Query qry = sess.createSQLQuery("select custname from Invoice where invno=1001");
		
		String  obj = (String)qry.uniqueResult();
	  
	   System.out.println(obj);
	
	}
	
	public void namedQuery()
	{
		
           Session sess = HibernateUtil.getSession();
		
		
		Query qry = sess.getNamedQuery("amountQry");
		
		    qry.setDouble(0, 1000);
		
		
		    List<Invoice> invList = qry.list();
	    	
		    displayList(invList);
	}
	
	public void criteriaQuery()
	{
		Criteria ctr = HibernateUtil.getSession().createCriteria(Invoice.class);
		
		
	 	
		ctr.add(Restrictions.like("customer", "Guru"));
		
		List<Invoice> invList = ctr.list();
		
		displayList(invList);
		
		
		       
		
	}
	public void orderdCriteria()
	{
	
		Criteria ctr = HibernateUtil.getSession().createCriteria(Invoice.class);
		
		 ctr.add(Restrictions.gt("invAmount", 1000.00d));
		 ctr.addOrder(Order.asc("invNo"));
		 
		 List<Invoice> invList = ctr.list();
		 
		 displayList(invList);
		 
	}
	
	public void projectionQuery()
	{
		Criteria ctr = HibernateUtil.getSession().createCriteria(Invoice.class);
		
		ProjectionList prjList = Projections.projectionList();
		
		prjList.add(Projections.avg("invAmount"));
		prjList.add(Projections.sum("invAmount"));
		
		ctr.setProjection(prjList);
		
		List result = ctr.list();
		
		  Iterator itr = result.iterator();
		  
		  while(itr.hasNext())
		  {
			  Object[] objList = (Object[])itr.next();
			 
			  for(int i=0;i<objList.length;i++)
			  {
				  System.out.println(objList[i]);
			  }
		  }
		  
		}
	
	public void querybyExample()
	{
		
         Criteria ctr = HibernateUtil.getSession().createCriteria(Invoice.class);
		
		   Invoice inv = new Invoice();
		   
  	        inv.setCustomer("Rajesh");
		    inv.setInvAmount(15600);
		 
		    Example ex1 = Example.create(inv).excludeProperty("invAmount");
		    
		    ctr.add(ex1);
		    
		    List<Invoice> invResult = ctr.list();
		 
		    displayList(invResult);
		    
		    
		    
		
	}
	
	
}  


