package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="authorTable")

public class Author {
	@Id
	@SequenceGenerator(name="myseq", sequenceName="seq_author",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="myseq")
	
	@Column(name="authorId")
	private int authorId;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="middleName")
	private String middleName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="phoneNo")
	private int phoneNo;
	
	@Override
	public String toString() {
		return "AuthorTable [authorId=" + authorId + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + 
				", phoneNo=" + phoneNo +"]";
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Author(int authorId, String firstName, String middleName,
			String lastName, int phoneNo) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
