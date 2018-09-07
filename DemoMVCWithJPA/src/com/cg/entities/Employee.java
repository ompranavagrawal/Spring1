package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="emp_new")

public class Employee {
	@Id
	@Column(name="empno")
	@NotNull(message="Empno is mandatory")
	private Integer empno;
	
	@Column(name="empname")
	@NotEmpty(message="EmpName is mandatory")
	@Pattern(regexp="[A-za-z]{3,15}",message="Name should contain 3 and max 15 letters")
	private String empname;
	
	@Column(name="age")
	@NotNull(message="ge is mandatory")
	private Integer age;
	

	public Integer getEmpno() {
		return empno;
	}


	public void setEmpno(Integer empno) {
		this.empno = empno;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Employee() {
		super();
		
	}
	
}
