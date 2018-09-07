package com.cg.demo;

public class Address {
	private String Address;
	private String city;
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String address, String city) {
		super();
		Address = address;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [Address=" + Address + ", city=" + city + "]";
	}
	
}
