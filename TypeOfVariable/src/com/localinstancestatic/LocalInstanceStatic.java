package com.localinstancestatic;

public class LocalInstanceStatic {

	//Local Variable
	private void gender() {
		System.out.println("Male");
		}
		
	//Instance Variable
	public String name = "Jagan";
	
	//Static Variable
	static int age = 26;
	
	public static void main(String[] args) {
		
		//Activating Local Variable
		LocalInstanceStatic l = new LocalInstanceStatic();
		l.gender();
		
		//Activating Instance Variable by creating newobject-----(l)
		System.out.println(l.name);
		
		//Activating Static Variable by directly calling variable name-----(name)
		System.out.println(age);
		
	}
}
