package com.xpathtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task4 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp\r\n");
	
	driver.findElement(By.xpath("//input[@id='DUMMY1']")).click();
	driver.findElement(By.xpath("//input[@title='User Id']")).sendKeys("123456789");
	driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("jaganathan");
	driver.findElement(By.xpath("//div[contains(text(),'Dashboard')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Recharge')]")).click();
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//input[@title='Log In'][1]")).click();
	
	}
}
