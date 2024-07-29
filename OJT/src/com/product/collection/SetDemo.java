package com.product.collection;

import java.util.HashSet;
import java.util.TreeSet;

import com.product.entity.Product;

public class SetDemo {

	public static void main(String[] args) {
		
//		HashSet <Product> h= new HashSet();
//		h.add(new Product(1,"Pencil",10,200));
//		h.add(new Product(2,"Rubber",20,300));
//		h.add(new Product(3,"Pen",30,400));
//		h.add(new Product(4,"Sharpner",40,500));
//		System.out.println(h);
		
		TreeSet <Product> hs= new TreeSet();
		hs.add(new Product(1,"Pencil",50,800));
		hs.add(new Product(2,"Rubber",20,900));
		hs.add(new Product(3,"Pen",80,500));
		hs.add(new Product(4,"Sharpner",40,700));
		System.out.println("Normal "+ hs);
		
		hs.add(new Product(5,"xyz",55,264));
		System.out.println("After Adding "+ hs);
		
		for(Product p:hs) {
			if(p.getProductid()==1) {
				Product pd=new Product (p.getProductid(),p.getProductName(),p.getPstock(),p.getProductcost());
				hs.remove(pd);
				break;
			}
		}
		System.out.println("After Deleted "+ hs);
	}

}
