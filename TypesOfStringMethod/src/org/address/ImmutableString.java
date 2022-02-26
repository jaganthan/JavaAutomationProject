package org.address;

public class ImmutableString {

	public static void main(String[] args) {
		
		String w = "Jagan";
			   w = "Mani";
		
		System.out.println("Memory Address Of Variable " + w);
		System.out.println(System.identityHashCode(w));
	}
}
