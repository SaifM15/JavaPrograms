package com.product.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	static LinkedList<Integer> ll;

	static void setData() {

		ll = new LinkedList();
		ll.add(100);
		ll.add(10);
		ll.add(236);
		ll.add(90);
		System.out.println("Normal Printing "+ ll);

		for (int i = 0; i < ll.size(); i++)
			System.out.println("Using For Loop "+ ll.get(i));

		for (Integer e : ll)

			System.out.println("Using for Each Loop "+ e);

		Iterator<Integer> it = ll.iterator();
		while (it.hasNext())

			System.out.println("using While and HasNext Method "+ it.next());

		ll.forEach((e) -> {
			System.out.println("using for each loop "+ e);
		});
	}

	public static void main(String[] args) {
		setData();
	}


}

