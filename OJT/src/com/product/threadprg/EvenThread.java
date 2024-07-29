package com.product.threadprg;

public class EvenThread extends Thread{
	
	public void run() {
		for(int i=2;i<=50;i+=2) {
			System.out.println("Even :- "+ i);
		}
	}

}
