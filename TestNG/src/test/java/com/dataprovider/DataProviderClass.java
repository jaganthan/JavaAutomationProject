package com.dataprovider;
import java.io.IOException;
import java.util.Date;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.frameworkpara.*;

public class DataProviderClass {
	@BeforeClass
	public void runBrowser()
	{
		BaseclassPara.launchBrowser();
		BaseclassPara.maximize();
	}
	
	@BeforeMethod
	public void url()
	{
		BaseclassPara.getUrl("https://adactinhotelapp.com/");
	}
	@AfterMethod
	public void dataPassed()
	{
		Date d = new Date();
		System.out.println("Data Passed : " + d);
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Test Closed");
		BaseclassPara.adactin.quit();
	}
	@Test(dataProvider="Input")
	public void checkData(String user, String pass) {
		PojoClass p = new PojoClass();
		BaseclassPara.toInput(p.getTxtUser(), user);
		BaseclassPara.toInput(p.getTxtPass(), pass);
		BaseclassPara.buttonClick(p.getClick());
	}
		
	@DataProvider(name="Input")
	public String[][] data() throws IOException
	{
		
		return new String[][] {
			{"mani","mani@12876"},{"jothi", "jo@2196"},{BaseclassPara.excelSheet(0, 0),BaseclassPara.excelSheet(0,1)}
		};
		
		
	}
}
