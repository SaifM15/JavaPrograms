package com.product.controller;

import com.product.entity.Student;
import com.product.service.StudentService;

public class StudentMain {

	public static void main(String[] args) {


		Student s1= new Student (1,"Saif",90);
		Student s2= new Student (2,"Shrddha",35);
		
		System.out.println(StudentService.comparePer(s1, s2));

	}

}
