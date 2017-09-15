package com.training.s1;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class FirstApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			
		//BeanFactory fact=new ClassPathXmlApplicationContext("context.xml");
	ConfigurableApplicationContext fact=new ClassPathXmlApplicationContext("context.xml");
							
		Customer cust1= fact.getBean("custBean",Customer.class);
		Invoicelist li=fact.getBean("invBean", Invoicelist.class);
		Invoicemap lm=fact.getBean("item5", Invoicemap.class);
				
	//	Customer cust2= fact.getBean("custBean",Customer.class);
		System.out.println("Bean with Injected Simple Value"+cust1.display()+ ":" + cust1.hashCode());
		System.out.println("Bean with Injected Simple Value"+li.getLi());
		
		System.out.println("Bean which is injected to the Invoicemap"+lm.getCust());
		
		Map<Integer,Item> items=lm.getMapId(); 
		Set<Map.Entry<Integer, Item>> il=items.entrySet();
		for(Map.Entry<Integer, Item> ff:il){
			System.out.println("Item Name" +ff.getValue().getItemName());
			System.out.println("Item Number" +ff.getValue().getItemNumber());
			System.out.println("Item Rate Per Unit" +ff.getValue().getRatePerUnit());
		}
		fact.close();
		}
		catch ( Exception e){
			e.printStackTrace();
		}
	}

}

