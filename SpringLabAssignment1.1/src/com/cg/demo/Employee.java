package com.cg.demo;

public class Employee {
	private int Id;
	private String Name;
	private int Salary;
	private String BU;
	private int Age;
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary
				+ ", BU=" + BU + ", Age=" + Age + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getBU() {
		return BU;
	}
	public void setBU(String bU) {
		BU = bU;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Employee(int id, String name, int salary, String bU, int age) {
		super();
		Id = id;
		Name = name;
		Salary = salary;
		BU = bU;
		Age = age;
	}
	public Employee() {
		super();

	}
}
