package com.training;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import com.training.ano.Employee;
import com.training.utils.HibernateUtil;

public class QueryExamples {

static Session sess=HibernateUtil.currentSession();
	
	public QueryExamples()
	{
	
	  	 sess.beginTransaction();
	}
	
	
	public void queryByPkey(int invno)
	{
		Invoice inv=(Invoice)sess.get(Invoice.class,invno);
		
		System.out.println(inv);
		
		   
	}
	private void display(List<Invoice> invList)
	{
		for(Invoice inv:invList)
		{
			System.out.println(inv);
		}
	}
	
	public void queryWhereClause(double amount )
	{
		Query qry=sess.createQuery("from Invoice where amount=:amt");
		
		 List invList=qry.setDouble("amt", amount).list();
		 
			display(invList);
	}
	
	public void querySelectColumns()
	{
		Query qry=sess.createQuery("select customerName,amount from Invoice");
		
		    List invList =qry.list();
		    
		    for(int i=0;i<invList.size();i++)
		    {
		    	  Object[] obj=(Object[])invList.get(i);
		    	  
		    	  System.out.println(obj[0]);
		    	  System.out.println(obj[1]);
			    	  
		    }
		    
		    
	}
	
	public void nativeQuery()
	{
		Query qry=sess.createSQLQuery(
				   "select * from Invoice").addEntity(Invoice.class);
		
		  List invList = qry.list();
		  
		   display(invList);
		
	}
	
	public void callNamedQuery()
	{
		Query qry=sess.getNamedQuery("listEmploye");
		      qry.setString("empName","XYZ");
		      
		  Employee emp = (Employee)qry.uniqueResult();
		  
		  System.out.println(emp);
		  
			
	}
	
	public void critAndExample()
	{
		Criteria crt =sess.createCriteria(Invoice.class);
		
		crt.add(Restrictions.gt("amount", 4500));
		crt.add(Restrictions.eq("name","Ramesh" ));
		
		  List list=crt.list();
		  
		   display(list);
		
		
	}
	
	public void critOrExample()
	{
		Criteria crt =sess.createCriteria(Invoice.class);
		
		 crt.add(Restrictions.or(
				 Restrictions.gt("amount", 1000),
				 Restrictions.lt("amount",5000 )));
		 
		 List list=crt.list();
		  
		   display(list);
	}
	
	public void qryByExample()
	{
		 Invoice inv =new Invoice();
		 
		    inv.setCustomerName("Ramesh");
		    inv.setAmount(4500);
		    
		    Example ex=Example.create(inv); 
		    
		    Criteria crt=sess.createCriteria(Invoice.class);
		    
		    crt.add(ex);
		    
		    List list =crt.list();
		    
		      display(list);
		      
	}
}
