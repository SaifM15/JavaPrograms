package com.product.controller;

import java.util.Scanner;
import java.util.TreeSet;

import com.product.collection.SortOnCost;
import com.product.collection.SortOnName;
import com.product.entity.Product;
import com.product.service.ProductService;

public class MainProduct {

	public static void main(String[] args) {
		TreeSet<Product> t;
		int ch, ch1= 0;
		Scanner sc = new Scanner(System.in);

		
		do {
			System.out.println("Enter uid");
			String uid = sc.next();
			
			if (uid.equals("Admin")) {
				do {
					System.out.println("1. Add Product");
					System.out.println("2. Delete Product");
					System.out.println("3. Update cost");
					System.out.println("4. Search Product");
					
					ch = sc.nextInt();

					switch (ch) {
					case 1: {
						System.out.println("Enter the id,Name,Cost,Stock");
						ProductService.addProduct(new Product(sc.nextInt(), sc.next(), sc.nextInt(),sc.nextInt()));
						break;
					}
					case 2: {
						System.out.println("Enter id");
						ProductService.removeProduct(sc.nextInt());
						break;
					}
					case 3: {
						System.out.println("Enter id and cost to be updated");
						ProductService.updateCost(sc.nextInt(), sc.nextInt());
						break;
					}
					case 4: {
						System.out.println("Enter id");
						ProductService.searchProduct(sc.nextInt());
						break;
					}
					
					}
					System.out.println("Enter 1 to continue as admin or Enter 0");
					ch1 = sc.nextInt();
				} while (ch1 == 1);
			} else if (uid.equals("cust")) {
				do {

					System.out.println("1. Search Product");
					System.out.println("2. Purchase the Product");
					System.out.println("3. Display all Product");
					ch = sc.nextInt();
					switch (ch) {
					case 1: {
						System.out.println("Enter id");
						ProductService.searchProduct(sc.nextInt());
						break;
					}
					case 2: {
						System.out.println("Enter id and Quantity ");
						ProductService.purchaseProduct(sc.nextInt(), sc.nextInt());

					}
					case 3: {
						ProductService.displayProduct();

					}
					}
					System.out.println("Enter 1 to continue as Customer else 0 ");
					ch1 = sc.nextInt();
				} while (ch1 == 1);
			}
			System.out.println(" Enter 1 to continue as a difference use  else enter 0 ");
			ch1=sc.nextInt();
		}
		while (ch1 == 1);
		
	}
}
