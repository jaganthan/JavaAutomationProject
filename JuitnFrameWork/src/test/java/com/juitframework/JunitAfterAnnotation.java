package com.juitframework;
import org.junit.After;
import org.junit.Test;

public class JunitAfterAnnotation {
	@After
	public void after() {
		System.out.println("AFTER");
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
