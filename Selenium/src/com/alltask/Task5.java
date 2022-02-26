package com.alltask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Task5	 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver net = new ChromeDriver();
		net.manage().window().maximize();
		
		net.get("https://netbanking.hdfcbank.com/ ");
		
		WebElement findId2 = net.findElement(By.name("fldLoginUserId"));
		findId2	.sendKeys("GreensTechnology");	
		
	}
}
