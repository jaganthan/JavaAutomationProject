package com.juitframework;
import org.junit.AfterClass;
import org.junit.Test;

public class JunitAfterClassAnnotation {
	@AfterClass
	public static void afterclass() {
		System.out.println("AFTERCLASS");
	}
	@Test
	public void test3() {
		System.out.println("c");
	}
	
	@Test
	public void test1() {
		System.out.println("a");
	}
	
	@Test
	public void test2() {
		System.out.println("b");
	}
}
