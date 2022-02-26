package org.stat;

public class Static2 {
	
	public static void main(String[] args) {
		
		//Calling Static Variable------classname.variablename()
		System.out.println(Satic1.name);
		
		Satic1 s = new Satic1();
		System.out.println(s.avg);
		
		//calling Static method-----classname.methodname()
		Satic1.stdId();
	}

	
}
