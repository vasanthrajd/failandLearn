package com.training;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.UserDao;

public class Application2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
			ApplicationContext ctx =new ClassPathXmlApplicationContext("bean.xml");
			
			   UserDao user =(UserDao)ctx.getBean("dao");
			   
			   int id =user.addUser(new User(106,"Rakesh"));
			   
			   System.out.println("One User with Id "+ id +"Added");
			
			      user.findUserbyId(103);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
