package com.product.service;

import com.product.entity.Product;
import com.product.entity.Student;

public class ProductService {

	static Product prod;
	static Product prodarr[] = new Product[3];

//	methods which takes product object as passing parameter
	public static void addProduct(Product p) {
		prod = new Product(p.getProductid(), p.getProductName(), p.getProductcost(),p.getPstock());
	}

//	This method return project object
	public static Product getProdDet() {
		return prod;
	}

//	Method with takes array object passing as a passing parameter
	public static void addProducts(Product parr[]) {
		for (int i = 0; i < parr.length; i++) {
			prodarr[i] = new Product();
			prodarr[i].setProductid(parr[i].getProductid());
			prodarr[i].setProductcost(parr[i].getProductcost());
			prodarr[i].setProductName(parr[i].getProductName());
			prodarr[i].setPstock(parr[i].getPstock());

		}
	}

	public static Product[] getProducts() {
		return prodarr;
	}

	public static void searchProduct(int id) {
		boolean flg = false;
		for (int i = 0; i < prodarr.length; i++) 
		{
			if(id==prodarr[i].getProductid())
			{
				flg=true;
				System.out.println(prodarr[i]);
			}
			if(flg==false)
			{
				System.out.println("Product not  found");
			}
		}
	}
	
	public static Product compareCost (Product  p1,Product p2)
	{
		if(p1.getProductcost()>p2.getProductcost()) {
			return p1;
		}
		else {
			return p2;
		}
	}
}
