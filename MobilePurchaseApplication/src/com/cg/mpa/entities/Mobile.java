package com.cg.mpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Mobiles")
public class Mobile {
	@Id
	@Column(name="mobileid")
	private Integer mobileId;
	
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(Integer mobileId, String mobileName, Double price,
			Integer quantity) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getMobileId() {
		return mobileId;
	}

	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name="Name")
	private String mobileName;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="quantity")
	private Integer quantity;
}
