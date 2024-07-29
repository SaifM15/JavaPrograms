package com.product.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		SingletonDemo d =  SingletonDemo.getObj();
		d.msg();
		
		LazyInstantiation li=  LazyInstantiation.getObj();
		li.msg();
	}

}
