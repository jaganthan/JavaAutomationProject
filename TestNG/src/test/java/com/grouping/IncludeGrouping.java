package com.grouping;
import org.testng.annotations.*;
public class IncludeGrouping {
	@Test(groups= {"smoke"})
	public void test1()
	{
		System.out.println("1");
	}
	
	@Test(groups= {"regression"})
	public void test2()
	{
		System.out.println("2");
	}
	
	@Test(groups= {"smoke","regression"})
	public void test3()
	{
		System.out.println("3");
	}
	
	@Test(groups= {"sanity"})
	public void test4()
	{
		System.out.println("4");
	}
}
