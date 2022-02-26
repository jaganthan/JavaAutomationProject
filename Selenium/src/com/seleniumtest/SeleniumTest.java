package com.seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		//classname newobject = new classname(Browser Driver Name)
		WebDriver d = new ChromeDriver();//---- use this to open in browser
		
		d.get("http://google.com");
		
	}
	
}
