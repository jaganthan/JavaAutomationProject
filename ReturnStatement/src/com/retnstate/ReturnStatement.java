package com.retnstate;

public class ReturnStatement {
	
	private String add()
	{
		String a = "JAGAN", b = "ATHAN";
		String c=a+b;
		
		return c;
	}
	private int sub()
	{
		int d = 25, e = 39;
		int f = d-e;
		return f;
	}
	public static void main(String[] args) {
		
		ReturnStatement r = new ReturnStatement();
		
		String j = r.add();
		System.out.println(j);
		
		int k = r.sub();
		System.out.println(k);
		
	}

}
