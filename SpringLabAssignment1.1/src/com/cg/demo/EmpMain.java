package com.cg.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("anno.xml");
		Employee emp=factory.getBean(Employee.class);
		System.out.println(emp);


	}

}
