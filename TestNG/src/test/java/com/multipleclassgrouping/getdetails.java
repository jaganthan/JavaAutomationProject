package com.multipleclassgrouping;
import java.util.Date;

import org.testng.annotations.*;
public class getdetails {
	@Test(groups= {"sanity"})
	public void date()
	{
		Date d = new Date();
		System.out.println("Date one : " + d);
	}
	
	@Test(groups= {"smoke"})
	public void date2()
	{
		Date d = new Date();
		System.out.println("Date two : " + d);
	}
	
	@Test(groups= {"regression","smoke"})
	public void date3()
	{
		Date d = new Date();
		System.out.println("Date three : " + d);
	}
}
