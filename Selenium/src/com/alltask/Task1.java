package com.alltask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver fac = new ChromeDriver();
		
		fac.manage().window().maximize();
		fac.get("http://www.facebook.com");
		
		WebElement findElement = fac.findElement(By.id("email"));
		findElement.sendKeys("mani@gmail.com");
		
		WebElement findElement2 = fac.findElement(By.id("pass"));
		findElement2.sendKeys("Qwerty@123");
		
		WebElement findElement3 = fac.findElement(By.name("login"));
		findElement3.click();
	}
}
