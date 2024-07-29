package com.product.singleton;

public class SingletonDemo {

//	Early Instantiation
//	create instance of a class at the time of declaring the data 
//	therefore instance of the class is creted at the class loading
	
	private static SingletonDemo obj = new SingletonDemo();

	SingletonDemo() {
		System.out.println("Early Private Constructor");
	}

	public static SingletonDemo getObj() {

		return obj;
	}

	public void msg() {
		System.out.println("Early Singleton Framework");
	}

}
