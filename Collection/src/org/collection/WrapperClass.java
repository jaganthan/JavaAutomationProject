package org.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class WrapperClass {
	
	public static void main(String[] args) {
		
		//Wrapper Class
		List<String> j = new ArrayList<>();
		
		j.add("Jaganathan");//0
		j.add("Manimaran");//1
		j.add("JothiLakshmi");//2
		j.add("Lokeshwari");//3
		
		System.out.println(j);
		
		//to add value in index position
		j.add(2, "Angel");
		System.out.println(j);
		
		//to get Index
		String q = j.get(2);
		System.out.println(q);
		
		//to find size of list
		int l = j.size();
		System.out.println(l);
		
		//isEmpty
		boolean l1 = j.isEmpty();
		System.out.println(l1);
		
		//set(index,element)
		String m = j.set(3, "Lakshmi");
		System.out.println(m + " Replaced with " + j.get(3));
		System.out.println(j);
		
		//remove element
		String l2 = j.remove(2);
		System.out.println(l2 + " As Been Removed From The List.");
		System.out.println(j);
		
		System.out.println(j.size());
		
		//contains(element)
		boolean l3 = j.contains("Angel");
		System.out.println(l3);
		
		boolean l4 = j.contains("Lakshmi");
		System.out.println(l4);
		
		//new list2
		List<String> k  = new LinkedList<String>();
		
		k.add("angel");
		k.add("jothi");
		
		
		//add all
		j.addAll(k);
		System.out.println(j);
		
		//retain All
		j.retainAll(k);
		System.out.println(j);
		
//		//removeAll
//		j.removeAll(k);
//		System.out.println(j);
		
		//both list equal or not
		boolean equals = j.equals(k);
		System.out.println(equals);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
