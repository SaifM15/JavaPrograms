package com.product.entity;

import java.util.Comparator;

public class Product implements Comparable<Product> {

	private int productid, pstock;
	private String productName;
	private int productcost;

	public Product(int productid, String productName, int productcost, int pstock) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productcost = productcost;
		this.pstock = pstock;
	}

	public int getPstock() {
		return pstock;
	}

	public void setPstock(int pstock) {
		this.pstock = pstock;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductcost() {
		return productcost;
	}

	public void setProductcost(int productcost) {
		this.productcost = productcost;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", pstock=" + pstock + ", productName=" + productName
				+ ", productcost=" + productcost + "]";
	}

	@Override
	public int compareTo(Product o) {
		if (this.getProductcost() == o.getProductcost())
			return 0;

		else if (this.getProductcost() > o.getProductcost())
			return 1;

		else
			return -1;

	}
	
	
}
