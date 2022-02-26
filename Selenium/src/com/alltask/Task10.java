package com.alltask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver snapdeal = new ChromeDriver();
	Robot r = new Robot();
	snapdeal.manage().window().maximize();
	
	snapdeal.get("https://www.snapdeal.com/");
	
	WebElement clickSearch = snapdeal.findElement(By.xpath("//input[@id='inputValEnter']"));
	clickSearch.sendKeys("redmi");
	
	Thread.sleep(800);
	for (int i=0; i<3; i++)
	{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	snapdeal.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
	snapdeal.findElement(By.xpath("//a[contains(text(),'Your Account')]")).click(); 
	Thread.sleep(800);
	snapdeal.findElement(By.xpath("//input[@name='username']")).sendKeys("807226788");
	snapdeal.findElement(By.xpath("//button[contains(text(),'continue')][1]")).click();
	
	}
}