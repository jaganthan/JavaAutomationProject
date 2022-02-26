package com.xpathtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Angel");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("jagan");
	driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("angeljagan8@gmail.com");
	driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("123415236");
	driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("123415236");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	
	}
	
}
