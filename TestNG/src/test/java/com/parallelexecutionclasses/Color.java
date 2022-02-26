package com.parallelexecutionclasses;
import org.testng.annotations.Test;
public class Color {
	@Test
	public void blue()
	{
		System.out.println("Blue " + Thread.currentThread().getId());
	}
	@Test
	public void green()
	{
		System.out.println("Green " + Thread.currentThread().getId());
	}
	@Test
	public void red()
	{
		System.out.println("Red " + Thread.currentThread().getId());
	}
}
