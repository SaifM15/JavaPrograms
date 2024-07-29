package com.product.collection;

import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String >m = new LinkedHashMap();	
		m.put(11,"Tara");
		m.put(22, "Shrddha");
		m.put(33, "Tejas");
		m.put(44, "Manoj");
		m.put(55, "Jay");
		
		System.out.println("Its LinkedHashMap "+ m);
		
		IdentityHashMap<Integer,String >m1 = new IdentityHashMap();	
		m1.put(11,"Tara");
		m1.put(22, "Shrddha");
		m1.put(33, "Tejas");
		m1.put(44, "Manoj");
		m1.put(55, "Jay");
		
		System.out.println("Its IdentityHashMap "+ m1);
		
		Set<Integer>st=m1.keySet();
		
		for(Integer k:st) {
			System.out.println("Key Sorting" + k);
		}
		
		for(Map.Entry<Integer, String> e:m1.entrySet()) {
			System.out.println("Sorting with key using entryset()" +e.getKey());
			System.out.println("Sorting with key using entryset()" +e.getValue());
		}
	}
}
