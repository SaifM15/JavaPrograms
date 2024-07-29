package com.product.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {


			static ArrayList<Integer> al;

			static void setData() {

				al = new ArrayList();
				al.add(100);
				al.add(10);
				al.add(236);
				al.add(90);
				System.out.println("Normal Printing "+ al);

				for (int i = 0; i < al.size(); i++)
					System.out.println("Using For Loop "+ al.get(i));

				for (Integer e : al)

					System.out.println("Using for Each Loop "+ e);

				Iterator<Integer> it = al.iterator();
				while (it.hasNext())

					System.out.println("using While and HasNext Method "+ it.next());

				al.forEach((e) -> {
					System.out.println("using for each loop "+ e);
				});
			}

			public static void main(String[] args) {
				setData();
			}	
}
	


