package com.training.ano.tab.persubclass;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.utils.HibernateUtil;

public class Application2 {

	
	static Session hiberSession;
	
	static  {
		
	hiberSession=HibernateUtil.getSession();	
	}

	
	public static void addItems(Item  itm)
	{
		Transaction tx = hiberSession.beginTransaction();
	     hiberSession.save(itm);
	     tx.commit();
		
	}
	
	
	 public static void getItem(int itemCode)
	 {
		 System.out.println(hiberSession.get(Item.class, itemCode));
		 
		 
	 }
	 
	 public static void close()
	 {
		  hiberSession.close();
	 }
	public static void main(String[] args) {
		
               
		
		Jwellery jwlObj = new Jwellery(501,"bangle",24 , "22crt");
		
		//ElectronicGadgets eleObj=
			    new ElectronicGadgets(402,"Iphone", "apple", "i3");
		
		addItems(jwlObj);
		//addItems(eleObj);
		
		getItem(301);
		getItem(302);
		
		close();
		
	}

}
