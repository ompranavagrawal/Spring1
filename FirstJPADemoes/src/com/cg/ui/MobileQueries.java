package com.cg.ui;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entites.Mobile;



public class MobileQueries {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		String jqpl="SELECT m FROM Mobile m WHERE m.quantity>:qty";       //remove it
		TypedQuery<Mobile> query=em.createQuery(jqpl,Mobile.class);       //remove it to run named Query
		//TypedQuery<Mobile> query=em.createNamedQuery("getMobiles",Mobile.class);          // <--------------------NAMEDQUERY
		query.setParameter("qty", 5);      //<-------------------variable parameters
		List<Mobile> mlist=query.getResultList();
		
		for(Mobile m:mlist){
			System.out.println(m);
		}

	}

}
