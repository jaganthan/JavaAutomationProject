package com.alltask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Task3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver redbuss = new ChromeDriver();
		redbuss.manage().window().maximize();
		
		redbuss.get("https://www.google.com/");
		
		WebElement findId = redbuss.findElement(By.name("q"));
		findId.sendKeys("GreensTechnology");
	
		WebElement findElement = redbuss.findElement(By.className("gNO89b"));
		findElement.click();
	}
}
