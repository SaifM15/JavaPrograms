package collection;

import java.util.Vector;

public class StudentVectorList {

	public static void main(String[] args) {
		
		Vector<StudentEntity> vl= new Vector();
		
		vl.add(new StudentEntity(1,"Saif","Mulla",76.20));
		vl.add(new StudentEntity(2,"Sagar","More",67.40));
		vl.add(new StudentEntity(3,"Shrddha","Kharade",70.00));
		vl.add(new StudentEntity(4,"Samir","Mulla",85.20));
		vl.add(new StudentEntity(5,"Somnath","kumbhar",69.65));
		
		System.out.println(vl);

		vl.add(2,new StudentEntity(5,"Soma","Pwar",69.65));
		System.out.println(vl);
		
		vl.remove(2);
		System.out.println(vl);
	}

}
