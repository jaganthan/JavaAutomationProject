package com.alltask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Task6	 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver snap = new ChromeDriver();
		snap.manage().window().maximize();
		
		snap.get("https://www.snapdeal.com/login/");
		
		WebElement findId = snap.findElement(By.name("username"));
		findId.sendKeys("Jaganathan@gmail.com");	
		
		WebElement findElement = snap.findElement(By.id("checkUser"));
		findElement.click();
		
	}
}
