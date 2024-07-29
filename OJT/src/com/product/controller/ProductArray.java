package com.product.controller;

import java.util.Scanner;

import com.product.entity.Product;

public class ProductArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Product[]  p = new Product[3];
		
		for(int i=0;i<p.length;i++) {
			
//			Initialization of object
			p[i]= new Product();
			System.out.println("Enter id,cost,pname");
			p[i].setProductid(sc.nextInt());
			p[i].setProductcost(sc.nextInt());
			p[i].setProductName(sc.next());
		}
		
		for(int i=0;i<p.length;i++) {
			System.out.println("Pid :- "+ p[i].getProductid());
			System.out.println("pcost :- "+ p[i].getProductcost());
			System.out.println("pname :- "+ p[i].getProductName());
		}
	}

}
