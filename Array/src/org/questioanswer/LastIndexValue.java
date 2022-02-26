package org.questioanswer;
import java.util.*;
//import java.util.ArrayList;
//import java.util.List;
public class LastIndexValue {
	
	public static void main(String[] args) {
		
		List<Integer> k = new ArrayList<Integer>();
		
		k.add(10);
		k.add(20);
		k.add(30);
		k.add(90);
		k.add(10);
		k.add(10);
		k.add(40);
		k.add(50);	
		
		int lastIndexOf = k.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
	}
}
