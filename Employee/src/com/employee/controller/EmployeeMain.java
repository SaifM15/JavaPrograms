package com.employee.controller;

import java.util.Scanner;

import com.employee.entity.Employee;

public class EmployeeMain {
	public static void main(String[] args) {

		Employee em = new Employee();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee id");
		em.setEmpid(sc.nextInt());
		
		System.out.println("Enter Employee Name");
		em.setEname(sc.next());
		
		System.out.println("Enter Employee Salary");
		em.setEsalary(sc.nextInt());
		
		System.out.println("Employee id "+ em.getEmpid());
		System.out.println("Employee Name "+ em.getEname());
		System.out.println("Employee Salary "+ em.getEsalary());
		
		System.out.println("Enter id,cost,name");
//		Use of Parameterized Constructor 
		Employee  em2=new Employee (sc.nextInt(),sc.next(),sc.nextInt());
//		Printing the object
		System.out.println(em2);

	}
}
