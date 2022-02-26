package org.stringmethod;
public class Lenth {
		public static void main(String[] args) {
		
		String j = "Jaganathan Is A Professional Programmer";
		System.out.println(j);
		
		//length()
		int l = j.length();
		System.out.println(l);
		
		//charAt(index)
		char c = j.charAt(2);
		System.out.println(c);
			if(c=='p')
			{
				System.out.println("Its G");
			}
			else
			{
				System.out.println("Not G");
			}
			
		//indexOf(value)
		int i = j.indexOf('P');
		System.out.println(i);
		
		//lastIndexOf(value)
		int e = j.lastIndexOf('P');
		System.out.println(e);
		
		//toUppercase()
		String s = j.toUpperCase();
		System.out.println(s);
		
		//toLowerCase()
		String s1 = j.toLowerCase();
		System.out.println(s1);
		
		//isEmpty()
		boolean b = j.isEmpty();
		System.out.println(b);
			if(b==false)
			{
				System.out.println("Not Empty");
				String s5 = j.substring(0,10);
				System.out.println(s5);
			}
		
		//substring(start Index)
		String s2 = j.substring(5);
		System.out.println(s2);
		
		//substring(start Index,End Index)
		String s3 = j.substring(5,12);
		System.out.println(s3);
		
		//startsWith(value)
		boolean p2 = j.startsWith("Ja");
		System.out.println(p2);
				
		//endsWith(value)
		boolean p3 = j.endsWith("mmer");
		System.out.println(p3);
				
		//contains(value)
		boolean p4 = j.contains("is");
		System.out.println(p4);
		
		//replace(value)
		String p5 = j.replace("Is","is");
		System.out.println(p5);
		
		//replaceAll
		String p6 = j.replaceAll("Jaganathan", "Jagan");
		System.out.println(p6);
		
		//trim
		String p7 = j.trim();
		System.out.println(p7);
	}
}
