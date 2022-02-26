package com.parallelexecutionmethods;
import org.testng.annotations.Test;
public class Place {
	@Test
	public void avadi()
	{
		System.out.println("Avadi " + Thread.currentThread().getId());
	}
	@Test
	public void ambattur()
	{
		System.out.println("Ambattur " + Thread.currentThread().getId());
	}
	@Test
	public void kalpakam()
	{
		System.out.println("Kalpakam " + Thread.currentThread().getId());
	}
}
