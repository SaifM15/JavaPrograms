package com.smg.entity;

public class Student {
	
	private int id;
	private String studentName;
	private String lastName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Student(int id, String studentName, String lastName) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.lastName = lastName;
		
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", lastName=" + lastName + "]";
	}
	

}
