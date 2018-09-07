package com.cg.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SBUMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("anno.xml");
		System.out.println("Employee Details");
		System.out.println("------------------------------------------------");
		
		SBU sbu =factory.getBean(SBU.class);
		System.out.println(sbu);
	}

}
