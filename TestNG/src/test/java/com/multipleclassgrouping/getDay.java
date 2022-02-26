package com.multipleclassgrouping;

import org.testng.annotations.Test;

public class getDay {
	@Test(groups= {"sanity"})
	public void day() {
		System.out.println("Day : Monday");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void day2()
	{
		System.out.println("Day : Tuesday");
	}
	
	@Test(groups= {"regression"})
	public void day3()
	{
		System.out.println("Day : Wednesday");
	}
}
