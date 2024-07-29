package com.product.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization_Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student s = new Student(1,"Sagar");
		
		FileOutputStream  fo= new FileOutputStream ("Student.txt");
		
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(s);
//		Written the object into the file
//		Serialization
		os.close();
		System.out.println("Object Serialized");
		
		FileInputStream fi= new FileInputStream("Student.txt");
		
		ObjectInputStream  is= new ObjectInputStream (fi);
		Student  s1= (Student)is.readObject();
		System.out.println(s1);
	}

}
