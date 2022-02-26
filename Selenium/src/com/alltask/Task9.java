package com.alltask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Task9	 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver swig = new ChromeDriver();
		swig.manage().window().maximize();
		
		swig.get("https://www.swiggy.com/");
		
		WebElement findId = swig.findElement(By.id("location"));
		findId.sendKeys("Chennai");	
		
		
	}
}
