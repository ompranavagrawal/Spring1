package com.cg.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class HelloMain {

	public static void main(String[] args) {
		/*XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("anno.xml"));*/
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("anno.xml");
		/*HelloBean bean=(HelloBean)factory.getBean("hBean");
		System.out.println(bean.HelloWorld());

		
		Address myAdd=(Address)factory.getBean("address");
		System.out.println(myAdd);*/
		
		Employee emp=factory.getBean(Employee.class);
		System.out.println(emp);
	}

}
