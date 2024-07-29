package com.product.service;

import java.util.ArrayList;
import java.util.Comparator;

import com.product.entity.Product;

public class ProductService {

	static ArrayList<Product> al = new ArrayList();

	public static void addProduct(Product p) {
		al.add(p);
	}

	public static void displayProduct() {
		System.out.println(al);
	}

	public static void removeProduct(int pid) {
		for (Product p : al) {
			if (p.getProductid() == pid) {
				al.remove(p);
				System.out.println("Remove Product Succesfully...!!");
				break;
			}
		}
	}

	public static void searchProduct(int pid) {
		boolean flg = false;

		for (Product p : al) {
			if (p.getProductid() == pid) {
				System.out.println(p);
				flg = true;
				break;
			}
		}
		if (flg == false) {
			System.out.println("Product not Found....");
		}
	}

	public static void updateCost(int pid, int pcost) {

		for (Product p : al) {
			if (p.getProductid() == pid) {
				p.setProductcost(pcost);
				break;
			}
			System.out.println("Cost Updated Succesfully....!");
		}
	}

	public static void purchaseProduct(int pid, int qty) {

		int bill = 0;
		for (Product p : al) {
			if (p.getProductid() == pid) {
				if (p.getPstock() >= qty) {
					bill = p.getProductcost() * qty;
					p.setPstock(p.getPstock() - qty);
					System.out.println("Bill Amount = " + bill);
					break;
				} else {
					System.out.println("Insufficient of stock...!");
					System.out.println("Availble Stock is " + p.getPstock());
				}
			}
		}

	}

}
