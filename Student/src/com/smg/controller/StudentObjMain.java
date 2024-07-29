package com.smg.controller;

import java.util.Scanner;


import com.smg.entity.Student;
import com.smg.service.StudentServ;

public class StudentObjMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ch = 1;
		do {
			System.out.println("1.Enter Student Details");
			System.out.println("2.Display Student Details");
			System.out.println("3.Enter first 3 Student ");
			System.out.println("4.Display the All Students");
			System.out.println("5.Search Product");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter StudentId,Student Name,Student SurName");

				StudentServ.addStudent(new Student(sc.nextInt(), sc.next(), sc.next()));
				break;
			}
			case 2: {
				Student s = StudentServ.getStudent();
				System.out.println("Student Details :-" + s);
				break;
			}
			case 3: {
				Student[]sarr = new Student[3];

				for (int i = 0; i < sarr.length; i++) {

					sarr[i] = new Student();
					System.out.println("Enter id name and Surname");
					sarr[i].setId(sc.nextInt());
					sarr[i].setStudentName(sc.next());
					sarr[i].setLastName(sc.next());

				}
				StudentServ.addStudent(sarr);
				break;
			}
			case 4: {
				Student sarr[] = new Student[3];
				sarr = (StudentServ.getStudents());
				for (int i = 0; i <sarr.length; i++) {
					System.out.println("Student id" + sarr[i].getId());
					System.out.println("Studetn Name " + sarr[i].getStudentName());
					System.out.println("Student Surname " + sarr[i].getLastName());
					
				}
			}
			case 5:{
				System.out.println("Enter product id");
				StudentServ.searchProduct(sc.nextInt());
				break;
			}
			}
			System.out.println("Enter the 1 for continue else 0 for Exit");
			ch = sc.nextInt();
		} while (ch == 1);
	}
}