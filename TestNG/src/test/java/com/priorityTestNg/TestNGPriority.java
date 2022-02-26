package com.priorityTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPriority {
	@Test(priority=12)
	public void a()
	{
		System.out.println("TEST ONE");
	}
	@Test(priority=1)
	public void b()
	{
		System.out.println("TEST TWO");
	}
	@Test(priority=-15)
	public void c()
	{
		System.out.println("TEST THREE");
	}
	@Test(priority=-5)
	public void d()
	{
		Assert.assertTrue(false);
		System.out.println("TEST FOUR");
	}
	@Test(enabled=false)
	public void e()
	{
		System.out.println("TEST FIVE");
	}
	@Test(invocationCount=3)
	public void f()
	{
		System.out.println("TEST SIX");
	}
}
