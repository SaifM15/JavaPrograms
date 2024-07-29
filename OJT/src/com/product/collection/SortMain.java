package com.product.collection;

import java.util.Scanner;
import java.util.TreeSet;

import com.product.entity.Product;

public class SortMain {

	public static void main(String[] args) {
		TreeSet<Product> t;
		Scanner sc = new Scanner (System.in);
		System.out.println("1.Sort on Price");
		System.out.println("2.Sort on Name");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			
			t=new TreeSet(new SortOnCost());
		     t.add(new Product(1,"A",1000,900));
		     t.add(new Product(11,"AA",1000,100));
		     t.add(new Product(9,"AAAA",900,90));
			
			System.out.println(t);
			break;
			
		
		case 2:
			
		{
			t=new TreeSet(new SortOnName());
		     t.add(new Product(1,"BB",1000,900));
		     t.add(new Product(11,"AA",11000,100));
		     t.add(new Product(9,"DD",10000,90));
			
			System.out.println(t);
			break;
			
		
		}
	}

}}
