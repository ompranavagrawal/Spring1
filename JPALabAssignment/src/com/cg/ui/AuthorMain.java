
package com.cg.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder.Case;

import com.cg.entities.Author;

public class AuthorMain {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int num;
		do{
			System.out.println("***********MENU***********\n1 : Insert\n2 : Delete\n3 : Update\n"
					+ "4 : Display\n5 : Exit");
			num=sc.nextInt();
			switch (num) {
			case 1:
				Insert();
				break;
			case 2:
				Delete();
				break;
			case 3:
				Update();
				break;
			case 4:
				Display();
				break;
			case 5:
				Exit(0);
				break;	
			default:
				System.out.println("Enter valid choice");
				break;
			}
			
		}while(num<5);
		
		
	}
	
	
	private static void Exit(int i) {
		// TODO Auto-generated method stub
		
	}


	static void Insert(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		//System.out.println(mob);
		//for CRUD operation
		Author ath=new Author();
		System.out.println("Enter Author First Name:");
		ath.setFirstName(sc.next());
		System.out.println("Enter Author Middle Name:");
		ath.setMiddleName(sc.next());
		System.out.println("Enter Author Last Name:");
		ath.setLastName(sc.next());
		System.out.println("Enter Author's Phone No.:");
		ath.setPhoneNo(sc.nextInt());
		em.getTransaction().begin();
		em.persist(ath);
		em.getTransaction().commit();
		
		System.out.println("Author details Inserted..........");
	}
	
	static void Display(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();

		System.out.println("Enter Author ID to Display");
		Scanner sc=new Scanner(System.in);
		int id = sc.nextInt();
		Author author=new Author();
	    author=em.find(Author.class, id);
		System.out.println(author);
	}
	
	static void Delete(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();

		System.out.println("Enter Author ID to Delete");
		Scanner sc=new Scanner(System.in);
		int id = sc.nextInt();
		Author author=new Author();
		author=em.find(Author.class, id);
		
		em.getTransaction().begin();
		em.remove(author);
		em.getTransaction().commit();
		
		System.out.println("Author details Deleted..........");
	}
	static void Update(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();

		System.out.println("Enter Author ID to Update");
		Scanner sc=new Scanner(System.in);
		int id = sc.nextInt();
		//Author author=new Author();
		Author ath=em.find(Author.class, id);
		em.getTransaction().begin();
		System.out.println("Enter the First Name:");
		ath.setFirstName(sc.next());
		System.out.println("Enter the Middle Name");
		ath.setMiddleName(sc.next());
		System.out.println("Enter the Last Name");
		ath.setLastName(sc.next());
		System.out.println("Enter the Phone number");
		ath.setPhoneNo(sc.nextInt());
		em.getTransaction().commit();
	}
	
	
	
}
