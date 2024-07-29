package com.student.service;

import java.util.ArrayList;

import collection.StudentEntity;

public class StudentService {

	static ArrayList<StudentEntity> al = new ArrayList();

	public static void addStudent(StudentEntity s) {
		al.add(s);
	}

	public static void removeStudent(int id) {

		for (StudentEntity r : al) {
			if (r.getId() == id) {
				al.remove(r);
				System.out.println("Student remove Successfully");
				break;
			}
		}
	}

	public static void searchStudent(int id) {

		boolean flag = false;

		for (StudentEntity r : al) {
			if (r.getId() == id) {
				System.out.println(r);
				flag = true;
				break;

			}
		}

		if (flag == false) {
			System.out.println("Student is not Found");
		}

	}
	
	public static void updateStudent(int id,double marks) {
		for (StudentEntity r : al) {
			if (r.getId() == id) {
				r.setMarks(marks);
				break;
			}
			System.out.println("Marks Updated Successfully");
	}
}
}
