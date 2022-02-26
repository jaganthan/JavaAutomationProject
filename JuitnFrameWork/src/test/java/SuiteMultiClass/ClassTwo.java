package SuiteMultiClass;

import org.junit.Assert;
import org.junit.Test;

public class ClassTwo {
	@Test
	public void c()
	{
		System.out.println("Mani");
	}
	
	@Test
	public void a()
	{
		Assert.assertTrue(false);
		System.out.println("Mani");
	}
}
