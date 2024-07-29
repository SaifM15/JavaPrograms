package com.smg.controller;

import java.util.Scanner;

import com.smg.entity.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Details");
		
		System.out.println("Enter your id");
		s.setId(sc.nextInt());
		System.out.println("Enter Your Name");
		s.setStudentName(sc.next());
		System.out.println("Enter Your Surname");
		s.setLastName(sc.next());
		
		System.out.println("Student Id "+ s.getId());
		System.out.println("Student Name "+ s.getStudentName());
		System.out.println("Student Surname "+ s.getLastName());
		
		System.out.println("Enter the id , Name, Surname");
		Student s1 = new Student(sc.nextInt(),sc.next(),sc.next());
		System.out.println("The Student Details are "+ s1);

	}

}
