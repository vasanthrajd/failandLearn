package com.training.tab.perclass;
import java.util.*;
import java.sql.SQLException;
import org.hibernate.*;
import org.hibernate.cfg.*;

import com.training.tab.perclass.LifeInsurance;
import com.training.tab.perclass.Insurance;
import com.training.utils.HibernateUtil;

public class Appliation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SessionFactory sf=null;
		Session sess=null;
		try
		{
			
			
			
				
			 sess = HibernateUtil.getSession();
			 
			 Transaction tx=sess.beginTransaction();
			 
			 LifeInsurance lifeObj = new LifeInsurance();
			 
			/* lifeObj.setPolicyNumber(104);
			 lifeObj.setPolicyHolderName("Sumesh");
			 lifeObj.setPaymentMode("Yearly");
			 lifeObj.setPremiumAmount(6500.00);
			
					sess.save(lifeObj);
				
					tx.commit();*/
					
					Query query = sess.createQuery("from Insurance");
					List<LifeInsurance> policy = query.list();
		
					for(LifeInsurance insObj:policy)
					{
						System.out.println(insObj.getPolicyHolderName());
					    System.out.println(insObj.getPolicyNumber());
					    System.out.println(insObj.getPremiumAmount());
					    System.out.println(insObj.getPaymentMode());
					}
					
					sess.close();
					sf.close();
			
				
			}
			 catch (HibernateException e) {
			
				e.printStackTrace();
			}
			}

		

}
