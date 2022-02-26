package com.grouping;
import org.testng.annotations.Test;
public class ExcludeGrouping {
	@Test(groups= {"smoke"})
	public void a() {
		System.out.println("A");
	}
	
	@Test(groups= {"regression"})
	public void b() {
		System.out.println("B");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void c() {
		System.out.println("C");
	}
	
	@Test(groups= {"sanity"})
	public void d() {
		System.out.println("C");
	}
}
