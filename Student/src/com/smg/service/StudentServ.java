package com.smg.service;

import com.smg.entity.Student;

public class StudentServ {

	static Student stud;
	static Student studarr[] = new Student[3];
	
	public static void addStudent(Student s) 
	{
		stud=new Student(s.getId(),s.getStudentName(),s.getLastName());
	}
	public static Student getStudent()
	{
		return stud;
	}
	
	
	public static void  addStudent(Student sarr[]) {
	for(int i=0;i<sarr.length;i++) {
		studarr[i] = new Student();
		studarr[i].setId(sarr[i].getId());
		studarr[i].setStudentName(sarr[i].getStudentName());
		studarr[i].setLastName(sarr[i].getLastName());
	}
	}
	
	public static Student[] getStudents() {
		return studarr;
	}
	public static void searchProduct(int id) {
		boolean flg = false;
		for (int i = 0; i < studarr.length; i++) 
		{
			if(id==studarr[i].getId())
			{
				flg=true;
				System.out.println(studarr[i]);
			}
			if(flg==false)
			{
				System.out.println("Product not  found");
			}
		}
	}

}
