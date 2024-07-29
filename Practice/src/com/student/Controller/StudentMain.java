package com.student.Controller;

import java.util.Scanner;

import com.student.service.StudentService;

import collection.StudentEntity;

public class StudentMain {

	public static void main(String[] args) {


			int ch  ,ch1=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter User Id **Admin** or **Student**");
			String uid=sc.next();
			if(uid.equals("admin")); 
			{
			do {
				System.out.println("1.Add Student");
				System.out.println("2.Remove Student");
				System.out.println("3.Search Student");
				System.out.println("4.Update Student");
				ch=sc.nextInt();
				
				switch(ch) {
				case 1:
				{
					System.out.println("Enter the id name surname and marks");
					StudentService.addStudent(new StudentEntity(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble()));
					break;
					
				}
				case 2:
				{
					System.out.println("Give id for Remove");
					StudentService.removeStudent(sc.nextInt());
					break;
				}
				
				case 3:
				{
					System.out.println("Enter id For Search");
					StudentService.searchStudent(sc.nextInt()	);
					break;
				}
				
				case 4:
				{
					System.out.println("Enter the id and marks for updation");
					StudentService.updateStudent(sc.nextInt(), sc.nextDouble());
					break;
				}
				}
				System.out.println("Enter 1 for Continue or else 0 for Exit");
				ch1=sc.nextInt();
				}while(ch1==1) ;
	}}}

