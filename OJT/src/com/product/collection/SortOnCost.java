package com.product.collection;

import java.util.Comparator;

import com.product.entity.Product;

public class SortOnCost implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		int pr1 = o1.getProductcost();
		int pr2 = o2.getProductcost();
		if (pr1 != pr2)
			return pr1 - pr2;

		else
			return o2.getProductid() - o1.getProductid();
		
		/*
		 * if(o1.getPcost()==o2.getPcost()) return 0;
		 * 
		 * else if(o1.getPcost()>o2.getPcost()) return 1; else return -1;
		 */
	}

}
