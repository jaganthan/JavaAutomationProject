package com.computer;

public class Desktop implements Hardware,Software{
	
	public void hardwareResources()
	{
		System.out.println("MH 303");
	}
	
	public void softwareResources()
	{
		System.out.println("Windows 10");
	}
	
	public static void main(String[] args) {
		
		Desktop d = new Desktop();
		d.hardwareResources();
		d.softwareResources();
	}
}
