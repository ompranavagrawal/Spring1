package com.cg.demo;

public class Employee {/*extends SBU{*/
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	SBU businessUnit;
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public SBU getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}

	public Employee() {
		super();
		
	}
	
	public Employee(int employeeId, String employeeName, int employeeSalary,
			SBU businessUnit) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.businessUnit = businessUnit;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeeSalary=" + employeeSalary
				+ ", businessUnit=" + businessUnit + "]";
	}

}
