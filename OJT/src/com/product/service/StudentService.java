package com.product.service;

import com.product.entity.Student;

public class StudentService {
	
	public static Student comparePer (Student s1,Student s2)
	{
		if(s1.getSper()>s2.getSper()) {
			return s1;
		}
		else {
			return s2;
		}
	}

}
