package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	static LinkedList<Integer> li;

	static void setData() {

		li = new LinkedList();
		li.add(5);
		li.add(2);
		li.add(8);
		li.add(9);
		li.add(5);
		
		System.out.println(" Normal way to Print An Linkedlist "+ li);
		
		for(int i=0;i<li.size();i++) {
			System.out.println(" It is using For loop "+ li.get(i));
		}
		
		for(int k:li) {
			System.out.println("With the help of For Each Loop "+ k);
		}
		
		Iterator <Integer> it= li.iterator();
		
		while(it.hasNext()) {
			System.out.println(" With Iterator "+ it.next());
		}

	}

	public static void main(String[] args) {
		
		setData();
		
	}

}
