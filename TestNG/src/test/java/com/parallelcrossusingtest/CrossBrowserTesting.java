package com.parallelcrossusingtest;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	
	public static WebDriver adactin;
	//public static Date d;
	@Parameters({"Browser"})
	@Test
	public void tc1(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			adactin = new ChromeDriver();
			Date d = new Date();
			System.out.println("Chrome Executed : " + d);
		}
		else if(browserName.equals("gecko"))
		{
			WebDriverManager.firefoxdriver().setup();
			adactin = new FirefoxDriver();
			Date d = new Date();
			System.out.println("Firefox Executed : " + d);
		}
		else
		{
			System.out.println("error");
			WebDriverManager.edgedriver().setup();
			adactin = new EdgeDriver();
			Date d = new Date();
			System.out.println("Edge Executed : " + d);
		}
		adactin.get("https://adactinhotelapp.com/");
	}
}
