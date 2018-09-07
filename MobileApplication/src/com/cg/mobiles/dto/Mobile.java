package com.cg.mobiles.dto;

public class Mobile {
	private int mobileid;
	private String mname;
	private double price;
	private int quantity;
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Mobile [mobileid=" + mobileid + ", mname=" + mname + ", price="
				+ price + ", quantity=" + quantity + "]";
	}
	
}
