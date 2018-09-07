package com.cg.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("anno.xml");
		System.out.println("Employee Details");
		System.out.println("------------------------------------------------");
		
		
		Employee emp=factory.getBean(Employee.class);
		System.out.println(emp);
		
	}

}
