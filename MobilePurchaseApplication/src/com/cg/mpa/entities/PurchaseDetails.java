package com.cg.mpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="purchaseDetails")
public class PurchaseDetails {
	@Id
	@Column(name="purchaseId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	@SequenceGenerator(name="seq",sequenceName="seq_purchase_id",allocationSize=1)
	private Integer purchaseId;
	@NotEmpty(message="Name is mandatory")
	@Pattern(regexp="[A-Z][a-zA-Z]{3,15}",message="Name should contain letters only between 5 to 15 charactes")
	@Column(name="CName")
	private String custName;
	
	@Column(name="PhoneNo")
	@NotNull(message="Phone No is required")
	@Pattern(regexp="[0-9]{10}",message="phone no. should contain 10 digits only")
	private String phoneNo;
	
	@Column(name="mailId")
	@Email(message="enter valid email Id")
	private String emailId;
	
	public PurchaseDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PurchaseDetails [purchaseId=" + purchaseId + ", custName="
				+ custName + ", phoneNo=" + phoneNo + ", emailId=" + emailId
				+ ", purchaseDate=" + purchaseDate + ", mobileId=" + mobileId
				+ "]";
	}

	public Integer getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Integer getMobileId() {
		return mobileId;
	}

	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}

	public PurchaseDetails(Integer purchaseId, String custName, String phoneNo,
			String emailId, String purchaseDate, Integer mobileId) {
		super();
		this.purchaseId = purchaseId;
		this.custName = custName;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.purchaseDate = purchaseDate;
		this.mobileId = mobileId;
	}

	@Column(name="purchaseDate")
	@Pattern(regexp="[0-9]{2}-[A-Za-z]{3}-[0-9]{4}",message="Date must be filled")
	private String purchaseDate;
	
	@Column(name="mobileId")
	private Integer mobileId;
	
	
}
