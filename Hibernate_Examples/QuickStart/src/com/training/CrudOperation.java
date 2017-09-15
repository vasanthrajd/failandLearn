package com.training;
import java.util.*;
import java.sql.SQLException;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import com.training.utils.HibernateUtil;


public class CrudOperation {
	
	static Session sess=HibernateUtil.currentSession();
	
	public CrudOperation()
	{
             
             
            		 
	  	 sess.beginTransaction();
	}
	
	
	public void addData(Invoice inv) throws HibernateException,SQLException
	{
			sess.save(inv);
			
		
			sess.getTransaction().commit();
				
		
	}
		public void qryData() throws HibernateException,SQLException
		{
			
				
	        Query qry = sess.createQuery("from Invoice as invoice where  invoice.amount > ?")
	        		.setDouble(0,4000.0d);
	         List lst = qry.list();
	       
	        System.out.println(lst);
		
	}
	
	public void updateData (int idno) throws HibernateException,SQLException
	{
				
			Invoice inv = (Invoice)sess.load(Invoice.class, new Integer(idno));
			inv.setCustomerName("Ganesh Kumar");
			sess.update(inv);
			sess.getTransaction().commit();
		
		}

	public void deleteData (int idno) throws HibernateException,SQLException
	{
				
		
			Invoice inv = (Invoice)sess.load(Invoice.class, new Integer(idno));
			
			sess.delete(inv);
			
			sess.getTransaction().commit();
			System.out.println("Deleted");
		
	}

	public void usingOrCondition() throws HibernateException,SQLException
	{
		Criteria crt =sess.createCriteria(Invoice.class);
		
		 crt.add(Restrictions.or(Restrictions.lt("amount", 2000.0d), Restrictions.gt("amount",3000.0d)));
		 
		 List<Invoice> values=crt.list();
		 
		 System.out.println(values);
		 
		
	}
	public static void startApplication(CrudOperation crudObj)
	{

	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice [1-Add 2-Get 3-Delete 4-Update 5-Query");
		int opt =  sc.nextInt();
      
		
		try
		{
		
		   switch ( opt)
		   {
		  
		   case  1 :
			   System.out.println("Customer Name");
			   String custName = sc.next();
			   System.out.println("Amount");
			   double amt = sc.nextDouble();
			   Invoice inv = new Invoice();
			   inv.setCustomerName(custName);
			   inv.setAmount(amt);
			   crudObj.addData(inv);
		        break;
		   case 2 :
			   crudObj.usingOrCondition();
			    break;
		   case 3:
			   System.out.println("Enter the Invoice Number to Delete");
			   int  numtoDel = sc.nextInt();
			   crudObj.deleteData(numtoDel);
			   break;
		   case 4:
			   System.out.println("Enter the Invoice Number to Update");
			   int  updateNum = sc.nextInt();
			   crudObj.updateData(updateNum);
			   break;
		   case 5:
			   crudObj.qryData();
			   
		   }
		   
		
		}
	
	 catch (HibernateException e) {
	
		e.printStackTrace();
	} catch (SQLException e) {
	
		e.printStackTrace();
	}
	finally
	{
		sess.close();
		
	}

	}
	public static void main(String[] args) {


		CrudOperation crudObj = new CrudOperation();
	     startApplication(crudObj);
	
	
		}

}
