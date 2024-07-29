package com.product.threadprg;

public class Multiples extends Thread{

	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("Multiples :- "+(5* i));
		}
	}
	
}
