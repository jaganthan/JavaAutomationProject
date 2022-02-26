package com.gmailtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassGmail {
	public static WebDriver gmail;
	public static Action a;
	public static void runBrowser()
	{
		WebDriverManager.chromedriver().setup();
		gmail = new ChromeDriver();
	}
	public static void maximize()
	{
		gmail.manage().window().maximize();
	}
	public static void getUrl(String url)
	{
		gmail.get(url);
	}
	
	public static void passTxt(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	
	public static void click(WebElement element)
	{
		element.click();
	}
}
