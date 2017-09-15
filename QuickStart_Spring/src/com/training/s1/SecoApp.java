package com.training.s1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SecoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try{
		ApplicationContext ctx= new ClassPathXmlApplicationContext("newcontext.xml", "context.xml");
		Invoicemap inv2=ctx.getBean("inv2", Invoicemap.class);
		
		Invoicemap inv3=ctx.getBean("inv3", Invoicemap.class);
		System.out.println("Customer in new.xml"+ inv2.getCust());
		System.out.println(ctx.getBean("custBean", Customer.class));
		System.out.println("Customer Constr"+ inv3.getCust());
	}
		catch (Exception e){
			e.printStackTrace();
		}
	}

}
