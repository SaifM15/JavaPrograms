package collection;

import java.util.ArrayList;


public class StudentArrayList {

	public static void main(String[] args) {
	
		ArrayList<StudentEntity> al= new ArrayList();
		al.add(new StudentEntity(1,"Saif","Mulla",76.20));
		al.add(new StudentEntity(2,"Sagar","More",67.40));
		al.add(new StudentEntity(3,"Shrddha","Kharade",70.00));
		al.add(new StudentEntity(4,"Samir","Mulla",85.20));
		al.add(new StudentEntity(5,"Somnath","kumbhar",69.65));
		

		System.out.println("Normal Printing :- "+ al);
		
//		here we add on specific index 
		al.add(2, new StudentEntity(6,"Deva","Kale",99.99));
		System.out.println("add on Specific index :- "+ al);

//		Here we remove an element with using index
		al.remove(2);
		System.out.println("After Removing :- "+ al);
	}

}
