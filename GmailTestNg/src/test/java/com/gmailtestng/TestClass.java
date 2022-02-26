package com.gmailtestng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends PojoClassGmail{
@BeforeClass
public void openBrowser()
	{
		maximize();
		runBrowser();
	}

@BeforeMethod
public void getUrl()
{
	getUrl("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
}

@Test
public void enterUsername()
{
	PojoClassGmail p = new PojoClassGmail();
	
}
}
