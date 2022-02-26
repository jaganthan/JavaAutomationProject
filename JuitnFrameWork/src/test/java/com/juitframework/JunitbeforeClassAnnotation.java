package com.juitframework;

import org.junit.BeforeClass;
import org.junit.Test;

public class JunitbeforeClassAnnotation {
	@BeforeClass
	public static void beforeclass() {
		System.out.println("beforeClass");
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
