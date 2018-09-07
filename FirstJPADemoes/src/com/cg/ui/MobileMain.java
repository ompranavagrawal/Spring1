package com.cg.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entites.Mobile;

public class MobileMain {
	public static void main(String[] args){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		//Mobile mob=em.find(Mobile.class, 1001);
		Scanner sc=new Scanner(System.in);
		//System.out.println(mob);
		//for CRUD operation
		Mobile mob=new Mobile();
		System.out.println("Enter Mobile Name :");
		mob.setMobileName(sc.next());
		System.out.println("Enter Price");
		mob.setPice(sc.nextDouble());
		System.out.println("Enter quantity:");
		mob.setQuantity(sc.nextInt());//(sc.nextInt());
		
		
		em.getTransaction().begin();
		em.persist(mob);
		em.getTransaction().commit();
		
		System.out.println("mobile details Inserted..........");
	}
}
