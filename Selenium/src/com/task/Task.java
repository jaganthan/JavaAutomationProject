package com.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Task {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.gecko.driver", "F:\\Jagan Project\\Selenium\\Driver\\geckodriver.exe");
						
			WebDriver d = new FirefoxDriver();
			
			
						
			//run the url in FireFox browser
			d.get("http://www.greenstechnologys.com/");
			d.get("https://www.facebook.com/");
			d.get("https://www.amazon.in");
			d.get("http://greenstech.in/selenium-course-content.html");
		}
		
}