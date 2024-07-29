package com.product.controller;

import java.util.Scanner;

import com.product.entity.Product;
import com.product.service.ProductService;

public class ProductObjMain {

	public static void main(String[] args) {

		int ch = 1;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("1.Enter Product Details");
			System.out.println("2.Display Product Details");
			System.out.println("3.Enter details for 3 Products");
			System.out.println("4.Display the all products");
			System.out.println("5.Search Product");
			System.out.println("6.Compare cost of two products");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enter id ,cost and Name stock");
				ProductService.addProduct(new Product(sc.nextInt(), sc.next(), sc.nextInt(),sc.nextInt()));
				break;
			}
			case 2: {
				Product p1 = ProductService.getProdDet();
				System.out.println("Product Details :- " + p1);
				break;
			}
			case 3: {
				Product parr[] = new Product[3];
				for (int i = 0; i < parr.length; i++) {

//					Initialization of object
					parr[i] = new Product();
					System.out.println("Enter id,cost,pname,stock");
					parr[i].setProductid(sc.nextInt());
					parr[i].setProductcost(sc.nextInt());
					parr[i].setProductName(sc.next());
					parr[i].setPstock(sc.nextInt());
				}
				ProductService.addProducts(parr);
				break;
			}
			case 4:{
				Product parr[] = new Product[3];
				parr=( ProductService.getProducts());
				for(int i=0;i<parr.length;i++) {
					System.out.println("Pid "+ parr[i].getProductid());
					System.out.println("Pcost "+ parr[i].getProductcost());
					System.out.println("Pid "+ parr[i].getProductName());
					System.out.println("pStock "+ parr[i].getPstock());
//					break;
				}
			}
			case 5:{
				System.out.println("Enter product id");
				ProductService.searchProduct(sc.nextInt());
				break;
			}
			case 6:
			{
				System.out.println("Enter product 1 deatils ");
				Product p1=new Product (sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
				System.out.println("Enter product 2 details ");
				Product p2=new Product (sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());

				System.out.println(ProductService.compareCost(p1,p2));
				
			
			}
				}
			System.out.println("Enter 1 to Continue or Else 0 for Exit");
			ch = sc.nextInt();
		} while (ch == 1);
	}
}
