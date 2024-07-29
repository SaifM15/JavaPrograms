package com.product.singleton;

public class LazyInstantiation {
	
//  Lazy Instantiation
	private static LazyInstantiation obj;
	 
	LazyInstantiation() {
		System.out.println("Lazy Private Constructor");
	}

	public static  LazyInstantiation getObj()
	{
		if(obj==null) {
			obj=new LazyInstantiation();
		}
		return obj;
	}

	public void msg() {
		System.out.println("Lazy Singleton Framework");
	}
	

}
