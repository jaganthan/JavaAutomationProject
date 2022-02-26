package com.task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		
					
		//run the url in Chrome browser
		d.get(" http://www.greenstechnologys.com/");
		d.get("http://gmail.com/");
		d.get("http://www.flipkart.com/");
		d.get("http://greenstech.in/selenium-course-content.html");
	}
		
	}


