package com.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunMain {
	@Test
	public void tc1()
	{
		System.out.println("Test 1");
	}
	
	@Test
	public void tc2()
	{
		System.out.println("Test 2");
	}
	
	@Test(retryAnalyzer=IRetryAnalyzerFailed.class)
	public void tc3()
	{
		Assert.assertTrue(false);
		System.out.println("Test 3");
	}
	
	@Test
	public void tc4()
	{
		System.out.println("Test 4");
	}
	
	@Test
	public void tc5()
	{
		Assert.assertTrue(false);
		System.out.println("Test 5");
	}
}
