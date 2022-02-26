package org.stringmethod;

public class OtherStringMethods {
	
	public static void main(String[] args) {
			
	String s = "Jaganathan";
	String s1 = " is Programmer";
	String s2 = " And Hacker";
	
	//concat();
	String c = s.concat(s1);
	System.out.println(c);
	
	String e = c.concat(s2);
	System.out.println(e);
	
	//equals()
	boolean e1 = s.equals(s1);
	System.out.println(e1);
	
	//equalsIgnoreCase()
	boolean e2 = s1.equalsIgnoreCase(s2);
	System.out.println(e2);
	}
}
