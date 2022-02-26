package com.alltask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Task7	 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver inst = new ChromeDriver();
		inst.manage().window().maximize();
		
		inst.get("https://www.instagram.com/accounts/login/?hl=en");
		
		WebElement findId = inst.findElement(By.name("username"));
		findId.sendKeys("Jaganathan@gmail.com");	
		
		WebElement findElement = inst.findElement(By.name("password"));
		findElement.sendKeys("qwryuq");
		
	}
}
