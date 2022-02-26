package org.address;

public class MutableString {

	public static void main(String[] args) {
		
		//String Buffer
		StringBuffer s =  new StringBuffer("jagan");
		StringBuffer s2 = new StringBuffer("Manimaran");
		
		StringBuffer a = s.append(s2);
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		
		//StringBuilder
		StringBuilder s1 =  new StringBuilder("Lokeshwari");
		StringBuilder s3 = new StringBuilder("Jothilakshmi");
		
		StringBuilder b = s1.append(s3);
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
	}
}
