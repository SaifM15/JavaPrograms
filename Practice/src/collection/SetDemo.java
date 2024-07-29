package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		
		HashSet <Integer> hs= new HashSet();
		hs.add(24);
		hs.add(36);
		hs.add(12);
		hs.add(64);
		hs.add(98);
		hs.add(74);
		hs.add(null); /* Null Allowed Here */
		System.out.println("HashSet "+ hs);
		
		TreeSet <Integer> ts = new TreeSet();
		ts.add(10);
		ts.add(84);
		ts.add(41);
		ts.add(36);
		ts.add(67);
		ts.add(97);
		ts.add(null); /* Null Not Allowed Here */
		System.out.println("TreeSet "+ ts);
	
	}

}
