package com.xpathtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement enterName = driver.findElement(By.xpath("(//input[@name='email'])"));
		enterName.sendKeys("mohan@25");
		
		WebElement password = driver.findElement(By.xpath("(//input[@id='pass'])"));
		password.sendKeys("123456789");
		
		WebElement search = driver.findElement(By.xpath("(//button[@name='login'])"));
		search.click();
	}
}

