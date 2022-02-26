package com.xpathtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.findElement(By.xpath("//h2[contains(text(),'Interview Questions')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'CTS Interview Question ')]")).click();
	}
	
}
