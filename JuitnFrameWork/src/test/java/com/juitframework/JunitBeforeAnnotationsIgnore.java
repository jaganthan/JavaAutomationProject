package com.juitframework;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class JunitBeforeAnnotationsIgnore extends BaseClass{
	
	@Before
	public void runsAfterEachTestCaseExecution()
	{
		System.out.println("before");
	}
	
	@Test
	public void test1() {
		System.out.println("a");
	}
	@Test
	public void test3() {
		System.out.println("c");
	}
	
	@Test
	public void test2() {
		System.out.println("b");
	}
	@Ignore
	@Test
	public void test0() {
		System.out.println("d");
	}
}
