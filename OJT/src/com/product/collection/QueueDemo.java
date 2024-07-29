package com.product.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

import com.product.entity.Product;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue <String> pq = new PriorityQueue();
		pq.add("Navin");
		pq.add("Tejas");
		pq.add("Tara");
		pq.add("Saif");
		pq.add("Sagar");
		pq.add("Avinash");
//		pq.add(null);
//		it is shown null pointer exception
		System.out.println(pq.element());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		pq.offer("Offer method");
		Iterator it= pq.iterator();
		while(it.hasNext()) 
			System.out.println(it.next());
		
		PriorityQueue<Product> pq1= new PriorityQueue();
		pq1.add(new Product(12,"xyz",4354,5656));
		pq1.add(new Product(15,"qwe",45,126));
		pq1.add(new Product(1,"yth",34,856));
		pq1.add(new Product(3,"xas",54,456));
		System.out.println(pq1);
		
	}

}
