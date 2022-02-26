package org.set;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Set;
//import java.util.TreeSet;
import java.util.*;
public class SetCollection {
	public static void main(String[] args) {
		
	Set<String> q = new TreeSet<String>();
	q.add("Jagan");
	q.add("Java");
	q.add("Selenium");
	q.add("Angel");
	q.add("Jagan");
	//q.add(null);
	//q.add(null);
	
	System.out.println(q);
	
	q.remove("Angel");
	System.out.println(q);
	
	/*Except index method u can any method
	 * 		Except this below method
	 * 				get(index)
	 * 				indexOf(element)
	 * 				lastIndexOf(element)
	 * 				add(index,value)
	 * 				Set(index,value)
	 * 				remove(index)
	 * */
			
	
	}

}
