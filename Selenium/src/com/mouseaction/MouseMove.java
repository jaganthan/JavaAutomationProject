package com.mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				Actions a = new Actions(driver);
				driver.manage().window().maximize();
			
				driver.get("http://greenstech.in/selenium-course-content.html");
				
				WebElement move = driver.findElement(By.xpath("//div[contains(text(),'Courses ')]"));
				a.moveToElement(move).perform();
				
				WebElement move2 = driver.findElement(By.xpath("//span[contains(text(),'Data Science (5)')]"));
				a.moveToElement(move2).perform();
				
				WebElement clickTxt = driver.findElement(By.xpath("//span[contains(text(),'Data Science with SAS Certification Training')]"));
				clickTxt.click();
				
				
				
				
	}

}