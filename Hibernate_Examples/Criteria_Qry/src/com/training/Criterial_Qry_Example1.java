package com.training;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
class HibernateUtil
{
	static SessionFactory sf;
	static Session session;
	static 
	{
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		session  = sf.openSession();
	}
	public static Session getSession()
	{
		return session;
		
	}
	public static void closeSession()
	{
		session.close();
		sf.close();
	}
}
public class Criterial_Qry_Example1 {

	public static void exampleCriteria()
	{


	      Session ses = HibernateUtil.getSession();
	      
		  ses.beginTransaction();
		
		Criteria criteria = ses.createCriteria(Book.class);
		criteria.add(Restrictions.eq("name", "Java Persitance"));
		List<Book> books = criteria.list();
		
		
		for(Book bk :books)
		{
			System.out.println(bk.getIsbn());
			System.out.println(bk.getPublishDate());
			System.out.println(bk.getPrice());
		}
		
		

	}
	
	public static void qry_By_Example()
	{
		Session ses = HibernateUtil.getSession();
		
		ses.beginTransaction();
		Book book = new Book();
		book.setName("Java Persitance");
		book.setPrice(new Integer(450));
		Example exampleBook = Example.create(book);
		Criteria criteria = ses.createCriteria(Book.class)
		.add(exampleBook);
		List<Book> books = criteria.list();
		
		for(Book bk :books)
		{
			System.out.println(bk.getIsbn());
			System.out.println(bk.getPublishDate());
			System.out.println(bk.getPrice());
		}
		
	}
	
	public static void qryWithOrder()
	{
		Session ses = HibernateUtil.getSession();
		Criteria criteria = ses.createCriteria(Book.class)
		.addOrder(Order.asc("name"));
		
		List books = criteria.list();
		
		Iterator itr = books.iterator();
		
		while(itr.hasNext())
		{
			Book bk = (Book)itr.next();
			System.out.println(bk.getIsbn());
			System.out.println(bk.getName());
			System.out.println(bk.getPublishDate());
			System.out.println(bk.getPrice());
		}
		
		Criteria crtra  = ses.createCriteria(Book.class)
		.setProjection(Projections.projectionList()
		.add(Projections.groupProperty("publishDate"))
		.add(Projections.avg("price"))
		);
		List bks = criteria.list();
		
		itr = books.iterator();
		
		while(itr.hasNext())
		{
			Book bk = (Book)itr.next();
			System.out.println(bk.getIsbn());
			System.out.println(bk.getName());
			System.out.println(bk.getPublishDate());
			System.out.println(bk.getPrice());
		}
		ses.close();
	}
	public static void main(String[] args) {

		exampleCriteria();
		qry_By_Example();
		System.out.println("Qry Order");
		qryWithOrder();
		

	}

}
