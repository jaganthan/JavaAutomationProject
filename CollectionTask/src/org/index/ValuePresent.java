package org.index;
import java.util.*;

public class ValuePresent {
	
	public static void main(String[] args) {
		
		List<Integer> w = new Vector<Integer>();
		
		w.add(10);
		w.add(20);
		w.add(30);
		w.add(40);
		w.add(50);
		w.add(60);
		
		Integer n = w.get(4);
		System.out.println(n);
	}

}
