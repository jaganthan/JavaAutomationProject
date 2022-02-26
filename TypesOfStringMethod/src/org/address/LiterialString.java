package org.address;

public class LiterialString {
	
	public static void main(String[] args) {
		
		String s = "Jagan";
		String w = "Jagan";
		
		System.out.println(System.identityHashCode(w));
		System.out.println(System.identityHashCode(s));
	}

}
//incase of duplicate same address is shown
//2018699554