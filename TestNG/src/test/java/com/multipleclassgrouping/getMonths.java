package com.multipleclassgrouping;

import org.testng.annotations.Test;

public class getMonths {
	@Test(groups= {"regression"})
	public void months() {
		System.out.println("Months : January");
	}
	
	@Test(groups= {"smoke"})
	public void months2()
	{
		System.out.println("Months : February");
	}
	
	@Test(groups= {"sanity","smoke"})
	public void months3()
	{
		System.out.println("Months : March");
	}
}
