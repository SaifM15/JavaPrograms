package collection;

import java.util.LinkedList;

public class StudentLinkedList {

	public static void main(String[] args) {
		
		LinkedList<StudentEntity> li= new LinkedList();
		li.add(new StudentEntity(1,"Abc","xyz",58.77));
		li.add(new StudentEntity(2,"akash","Patil",45.20));
		li.add(new StudentEntity(3,"Aniket","Koli",97.1));
		li.add(new StudentEntity(4,"sushant","Boss",65.20));
		
		System.out.println("Normal Print"+li);
		
		li.add(2, new StudentEntity(4,"plk","mno",12.0));
		
		System.out.println("Adding On Specific Indec"+ li);
		
		li.remove(2);
		System.out.println("After Removing an Element :- "+li);
		

	}

}
