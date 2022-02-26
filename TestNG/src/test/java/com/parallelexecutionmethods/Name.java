package com.parallelexecutionmethods;
import org.testng.annotations.Test;
public class Name {
	@Test
	public void nameGender1()
	{
		System.out.println("Jaganathan : Male  " + Thread.currentThread().getId());
	}
	
	@Test
	public void nameGender2()
	{
		System.out.println("Manimaran : Male  " + Thread.currentThread().getId());
	}
	
	@Test
	public void nameGender3()
	{
		System.out.println("JothiLakshmi : Female  " + Thread.currentThread().getId());
	}
}
