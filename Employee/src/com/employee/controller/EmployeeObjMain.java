package com.employee.controller;

import java.util.Scanner;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

public class EmployeeObjMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch=1;
		do {
		System.out.println("1.Add Employee Details");
		System.out.println("2.Display Employee Details");
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:{
			System.out.println("Give id ,name,salary");
			EmployeeService.addEmployee(new Employee(sc.nextInt(),sc.next(),sc.nextInt()));
		}
		case 2:
		{
			Employee em= EmployeeService.detailsEmployee();
			System.out.println("The Employee Details are :- "+ em );
			break;
		}
	}	System.out.println("Enter 1 for continue else 0 for exit");
		ch=sc.nextInt();
	}while(ch==1);
	}
}
