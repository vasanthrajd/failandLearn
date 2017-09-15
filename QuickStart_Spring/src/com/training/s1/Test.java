package com.training.s1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		
		Student student=(Student)beanFactory.getBean("studentbean");
		student.displayInformation();
		
		student.setName("Devaraju");
		student.displayInformation();
	}

}
