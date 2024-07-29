package com.employee.entity;

public class Employee {

	private int empid;
	private String ename;
	private int esalary;
	
	
	public Employee(int empid, String ename, int esalary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int i) {
		this.esalary = i;
	}
	
	@Override
	public String toString() {
		return "EmployeeMain [empid=" + empid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

}
