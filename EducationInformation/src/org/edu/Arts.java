package org.edu;

public class Arts extends Education {
	@Override
	public void ug() {
		System.out.println("UG");
	}
	
	@Override
	public void pg()
	{
		System.out.println("PG");
	}
	
	public static void main(String[] args) {
		
		Arts a = new Arts();
		a.pg();
		a.ug();
	}
}
