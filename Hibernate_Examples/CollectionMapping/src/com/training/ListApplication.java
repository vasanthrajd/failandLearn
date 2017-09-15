package com.training;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.*;
import com.training.utils.HiberUtils;

public class ListApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		SessionFactory fact =HiberUtils.getSessionFactory();
		
		Session session = fact.openSession();
		
		Transaction tx =session.beginTransaction();
		
		List<String> parti=new ArrayList<String>();
		
		parti.add("Suresh");
		parti.add("Sukesh");
		parti.add("Sumesh");
		
		
		ListfTrainer trnr2=new ListfTrainer(102,parti,"Java");
		
		session.save(trnr2);
		
		 /* ListfTrainer trnr =(ListfTrainer)session.get(ListfTrainer.class, 101);
		  
		  System.out.println("Trainer Code "+trnr.getTrainerCode());
		  System.out.println("Subject "+ trnr.getSubject());
		  System.out.println("Participants "+ trnr.getParticipants());*/
		  
		  
		tx.commit();
		
		session.close();
		
		HiberUtils.close();
		
		
	}

}
