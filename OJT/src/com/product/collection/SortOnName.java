package com.product.collection;

import java.util.Comparator;

import com.product.entity.Product;

public class SortOnName implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		String nm = o1.getProductName();
		String nm1 = o2.getProductName();
		return nm.compareTo(nm1);
	}

}
