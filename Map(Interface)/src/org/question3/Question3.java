package org.question3;
import java.util.Map;
import java.util.TreeMap; 

public class Question3 {
	
	public static void main(String[] args) {
		
		Map<String,Integer> q = new TreeMap<String,Integer>();
		{
			q.put("!", 10);
			q.put("@", 20);
			q.put("#", 30);
			q.put("$", 40);
			q.put("%", 50);
			q.put("^", 60);
			q.put("&", 10);
			q.put("*", 50);
			q.put("(", 409);
			
			System.out.println(q);
		}
		
	}

}
