package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class FaceBookBaseClass{
	public static WebDriver fac;
	public static void maximize() {
		fac.manage().window().maximize();
	}
	public static void passUrl(String path) {
		fac.get(path);
	}
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		fac = new ChromeDriver();
	}
	public static void toInput(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	public static void buttonClick(WebElement element)
	{
		element.click();
	}
	public static void backpage()
	{
		fac.navigate().back();
	}
	public static void refresh()
	{
		fac.navigate().refresh();
	}
}
