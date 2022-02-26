package com.multipleclassgrouping;

import java.util.Date;

import org.testng.annotations.Test;

public class getTime {
	@Test(groups= {"smoke","regression"})
	public void time() {
		Date d =new Date();
		System.out.println("Time : " + d.getTime());
	}
	
	@Test(groups= {"sanity","smoke"})
	public void time2()
	{
		Date d = new Date();
		System.out.println("Time2 : " + d.getTime());
	}
	
	@Test(groups= {"regression","smoke"})
	public void time3()
	{
		Date d = new Date();
		System.out.println("Time3 : " + d.getTime());
	}
}
