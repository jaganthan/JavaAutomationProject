package org.questioanswer;

import java.util.ArrayList;
import java.util.List;

public class FirstIndexValue {
	
	public static void main(String[] args) {
		
		List<Integer> k =  new ArrayList<Integer>();
		
		k.add(10);
		k.add(20);
		k.add(30);
		k.add(90);
		
		int l = k.indexOf(10);
		System.out.println(l);
		
	}

}
