package com.product.controller;

import java.util.Scanner;

import com.product.entity.Product;
import com.product.exception.CostException;
import com.product.exception.InvalidNameException;
import com.product.exception.LessThanZeroException;

public class ProductMain {

	public static void main(String[] args) {

		try {
			Product p1 = new Product();

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter pid");
			int id = sc.nextInt();
			if (id < 0)
				throw new LessThanZeroException("Id Cannot less than Zero");
			p1.setProductid(id);

			System.out.println("Enter pname");
			String pname = sc.next();

			boolean f = pname.startsWith("P");
			if (f == false)
				throw new InvalidNameException("Product should start from 'P'");

			p1.setProductName(pname);

			System.out.println("Enter pcost");

			int cost = sc.nextInt();
			if (cost < 0)
				throw new LessThanZeroException("Cost cannot be Zero");
			else {
				p1.setProductcost(cost);

				System.out.println("Product Id " + p1.getProductid());
				System.out.println("Product Name " + p1.getProductName());
				System.out.println("Product Cost " + p1.getProductcost());

				System.out.println("Enter id,name,cost,stock");
//		Use of Parameterized Constructor 
				Product p2 = new Product(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());
//		Printing the object
				System.out.println(p2);

			}
		} catch (LessThanZeroException c) {
			System.out.println(c.getMessage());
		} catch (InvalidNameException inv) {
			System.out.println(inv.getMessage());
		}
	}

}
