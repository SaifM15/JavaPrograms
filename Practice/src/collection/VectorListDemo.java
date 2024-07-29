package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorListDemo {
	
	public static void main(String[] args) {
		
		Vector <Integer> vl;
		
		vl= new Vector();
		vl.add(20);
		vl.add(54);
		vl.add(85);
		vl.add(23);
		vl.add(12);
		
		System.out.println(vl);
		
		for(int i=0;i<vl.size();i++){
			System.out.println(vl.get(i));
		}

		for(int v:vl) {
			System.out.println(v);
		}
		
		Iterator <Integer> it= vl.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
