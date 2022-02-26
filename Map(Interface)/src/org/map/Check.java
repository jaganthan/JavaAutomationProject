package org.map;
import java.util.*;
import java.util.Map.Entry;
public class Check {
	
	public static void main(String[] args) {
		
		Map<Integer,Integer> p = new LinkedHashMap<Integer,Integer>();
		
		p.put(10, 10);
		p.put(20, 20);
		p.put(30, 30);
		p.put(40, 40);
		
		Set<Entry<Integer,Integer>> w = p.entrySet();
		
		for(Entry<Integer,Integer> e : w)
		{
			System.out.println("Key is : " + e.getKey());
		}
		
	}

}
