package com.product.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
		public static void main(String[] args) {
			
			HashMap<Integer,String >m = new HashMap();	
			m.put(11,"Tara");
			m.put(22, "Shrddha");
			m.put(33, "Tejas");
			m.put(44, "Manoj");
			m.put(55, "Jay");
			
			System.out.println("Its HashMap "+ m);
			
			TreeMap<Integer,String >m1 = new TreeMap();	
			m1.put(11,"Tara");
			m1.put(22, "Shrddha");
			m1.put(33, "Tejas");
			m1.put(44, "Manoj");
			m1.put(55, "Jay");
			
			System.out.println("Its TreeMap "+ m1);
			
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
