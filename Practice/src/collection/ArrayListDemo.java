package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	static ArrayList<Integer> al;

	static void setData() {

		al = new ArrayList();
		al.add(10);
		al.add(50);
		al.add(454);
		al.add(125);
		al.add(30);

//			It is a simple way to print a list
		System.out.println(al);

//	Here we use For loop For print List
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

//	Here we are use For each loop for print a list
		for (int k : al) {
			System.out.print(" " + k);
		}

//	with the help of Iterator we can print the List
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {

		setData();
	}

}
