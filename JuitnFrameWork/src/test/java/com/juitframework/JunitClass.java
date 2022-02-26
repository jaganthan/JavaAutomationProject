package com.juitframework;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitClass extends BaseClass{
	@BeforeClass
	public static void browser() {
		launchBrowser();
		maximize();
	}
	
	@Before
	public  void launch() {
		passUrl("https://adactinhotelapp.com/");
		Date d = new Date();
		System.out.println(d);
	}
	
	@After
	public  void quitBrowser() throws InterruptedException{
		Date d =  new Date();
		System.out.println(d);
		Thread.sleep(3000);
	}
	
	@AfterClass
	public static void close()
	{
		adactin.close();
	}
	
	@Test
	public void tc1()
	{
		//Assert.assertTrue(false);
		PojoClass p = new PojoClass();
		String url = adactin.getCurrentUrl();
		Assert.assertTrue("Website",url.contains("adactin"));
		sendTxt(p.getUsername(),"Jaganathan");
		Assert.assertEquals("Check the url","Jaganathan",getAttribute(p.getUsername()));
		sendTxt(p.getPassword(),"Qwerty@123");
		buttonClick(p.getClick());
		
	}
	@Ignore
	@Test
	public void tc2() {
		PojoClass p1 =  new PojoClass();
		
		sendTxt(p1.getUsername(),"jagan");
		sendTxt(p1.getPassword(),"Qwerty@");
	}
	
	
}
