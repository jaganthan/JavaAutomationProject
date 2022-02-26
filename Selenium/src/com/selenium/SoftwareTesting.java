package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SoftwareTesting {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\\\Jagan Project\\\\Selenium\\\\Driver\\\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver d = new FirefoxDriver();
		WebDriver q = new ChromeDriver();
		
		//to maximaze windows
		d.manage().window().maximize();
		
		//run the url in browser
		q.get("https://www.google.com/");//------open in chrome
		d.get("https://www.facebook.com/");//----open in firefox
		
		
		
		//to get url title
		String p = d.getTitle();
		System.out.println(p);
		
		//to print current url
		String currentUrl = q.getCurrentUrl();
		System.out.println(currentUrl);
		
		//close current tab
		//d.close();
		
		//to quit all tab
		 // q.quit();
		
	}	
	
}
