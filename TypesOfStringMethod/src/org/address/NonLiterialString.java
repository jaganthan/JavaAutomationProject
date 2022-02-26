package org.address;

public class NonLiterialString {
	
	public static void main(String[] args) {
		
	
	String d1 = new String("Jagan");
	String d2 = new String("Jagan");
	
	System.out.println(System.identityHashCode(d1));
	System.out.println(System.identityHashCode(d2));
	
	}
}
