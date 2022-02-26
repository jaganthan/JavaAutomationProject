package com.frameworkpara;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Sample extends PojoClass{
	@BeforeClass
	public void openBrowser()
	{
		launchBrowser();
		maximize();
	}
	@BeforeMethod
	public void url()
	{
		getUrl("https://adactinhotelapp.com/");
	}
	@Parameters({"username","passward"})
	@Test
	public void testCase1(String user, String pass)
	{
		PojoClass p = new  PojoClass();
		toInput(p.getTxtUser(), user);
		toInput(p.getTxtPass(), pass);
		buttonClick(p.getClick());
	}
	//incases the provided value is error
	@Parameters({"usrname","pssward"})
	@Test
	public void testCase2(@Optional("manimaran")String user, @Optional("mani@123456")String pass)
	{
		PojoClass p = new  PojoClass();
		toInput(p.getTxtUser(), user);
		toInput(p.getTxtPass(), pass);
		buttonClick(p.getClick());
	}
	
	
}
