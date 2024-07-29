package com.product.threadprg;

public class MainThread {

	public static void main(String[] args) {


		OddThread ot= new OddThread();
		EvenThread et= new EvenThread();
		Multiples m= new Multiples();
		
		ot.start();
		et.start();
		m.start();
		
		
		ot.setName("Odd");
		ot.setPriority(Thread.MAX_PRIORITY);
		System.out.println(ot);
		System.out.println(et);
		System.out.println(m);
		

	}

}
