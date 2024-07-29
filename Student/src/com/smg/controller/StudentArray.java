package com.smg.controller;

import java.util.Scanner;

import com.smg.entity.Student;

public class StudentArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Student s[]= new Student[3];

		for(int i=0;i<s.length;i++) {
			
			s[i]=new Student();
			System.out.println("Enter id name and Surname");
			
			s[i].setId(sc.nextInt());
			s[i].setStudentName(sc.next());
			s[i].setLastName(sc.next());
			
		}
		
		for(int i=0;i<s.length;i++) {
			System.out.println("Student id"+s[i].getId());
			System.out.println("Studetn Name "+ s[i].getStudentName());
			System.out.println("Student Surname "+ s[i].getLastName());
		}
	}

}
