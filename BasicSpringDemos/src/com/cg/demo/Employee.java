package com.cg.demo;

import java.util.List;

public class Employee {
	private int empid;
	private String ename;
	//private Address address;
	private List <Address> addressList;
	/*public Employee(){
		
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int empid, String ename, Address address) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", address="
				+ address + "]";
	}*/
	public Employee(int empid, String ename, List<Address> addressList) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.addressList = addressList;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename
				+ ", addressList=" + addressList + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
}
