package org.index;
import java.util.*;
public class IndexValue {

	public static void main(String[] args) {
		
		List<Integer> k =  new Vector<Integer>();
		
		k.add(10);
		k.add(20);
		k.add(30);
		k.add(90);
		
		int indexOf = k.indexOf(10);
		System.out.println("Index Value Of 10 : " + indexOf);
	}
	
}
