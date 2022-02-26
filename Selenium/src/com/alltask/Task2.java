package com.alltask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver redbuss = new ChromeDriver();
		redbuss.manage().window().maximize();
		
		redbuss.get("https://www.redbus.in/ ");
		
		WebElement findId = redbuss.findElement(By.id("src"));
		findId.sendKeys("Chennai");
	
		WebElement findId2 = redbuss.findElement(By.id("dest"));
		findId2.sendKeys("Goa");
	}
}
