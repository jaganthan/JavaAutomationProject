package org.map;

import java.util.*;
import java.util.Map.Entry;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<Integer,String> p = new TreeMap<Integer,String>();
		
		p.put(25, "jagan");
		p.put(37, "Amma");
		p.put(10, "appa");
		p.put(5, "sister");
		
		System.out.println(p);
		
		//ContainsKey()
		System.out.println(p.containsKey(34));
		
		//containsValue()
		System.out.println(p.containsValue("sister"));
		
		//values()
		Collection<String> q = p.values();
		System.out.println(q);
		
		//keySet()
		System.out.println(p.keySet());
		
		//entrySet
		System.out.println(p.entrySet());
	
		
		Set<Entry<Integer, String>> e = p.entrySet();
		
		for (Entry<Integer,String> o : e)
		{
			//to print values
			System.out.println("\nValue = " + o.getValue());
			
			//to print key
			System.out.println("key = " + o.getKey());
		}
		
//		Scanner t = new Scanner(System.in);
//		System.out.println("Name");
//		
//		
//		System.out.println("Name : " + y);
		
		
		
	}
}
