package org.question1;
import java.util.HashMap;
import java.util.Map;

public class Question1 {
	
	public static void main(String[] args) {
		
		Map<Integer,String> w = new HashMap<Integer,String>();
		
		w.put(10, "java");
		w.put(20, "sql");
		w.put(30, "oops");
		w.put(40, "Sql");
		w.put(50, "oracle");
		w.put(60, "DB");
		w.put(10, "selenium");
		w.put(50, "psql");
		w.put(40, "Hadoop");
		
		System.out.println(w);
		
	}

}
