package com.cg.demo;

import java.util.List;

public class SBU {
	private int sbuId;
	private String sbuName;
	private String sbuHead;
	private List<Employee> EmpList;
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead="
				+ sbuHead + "\n"+" EmpList=" + EmpList + "]";
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmpList() {
		return EmpList;
	}
	public void setEmpList(List<Employee> empList) {
		EmpList = empList;
	}
	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
