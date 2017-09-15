package com.training.maps;



import org.hibernate.Transaction;

import org.hibernate.Session;
import java.util.*;
import java.util.Map.Entry;

import com.training.utils.HibernateUtil;


public class Application2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Session hiberSession=HibernateUtil.getSession();
		
		
		       
		       
		       Transaction tx =hiberSession.beginTransaction();
		      		       
		       
		       
		       
		    /*  Catalog catObj =new Catalog();
		      
		        catObj.setCatlogNumber(301);
		        catObj.setProdName("Iphone");
		      
		        catObj.getImages().put("iphone3", "iph3_1.gif");
		        catObj.getImages().put("iphone2", "lph2_1.gif");
				
				 hiberSession.save(catObj);*/
				 
		       
		       Catalog catObj2=(Catalog)hiberSession.get(Catalog.class, 301);
		       
		       System.out.println(catObj2.getCatlogNumber());
		       System.out.println(catObj2.getProdName());
		       Map<String,String> imgs=catObj2.getImages();
		       
		       Set<Entry<String,String>> images=imgs.entrySet();
		       
		       for(Entry<String, String> i:images)
		       {
		    	   System.out.println("key :"+i.getKey());
		    	   System.out.println("Value :"+i.getValue());
		       }
				 
				tx.commit();
        
		       
		       

	}

}
