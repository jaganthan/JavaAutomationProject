package com.alltask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Task8	 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver inst = new ChromeDriver();
		inst.manage().window().maximize();
		
		inst.get("http://adactinhotelapp.com/");
		
		WebElement findId = inst.findElement(By.id("username"));
		findId.sendKeys("Jaganathan@gmail.com");	
		
		WebElement findElement = inst.findElement(By.name("password"));
		findElement.sendKeys("qwryuq");
		
		
		WebElement findElement2 = inst.findElement(By.name("login"));
		findElement2.click();
	}
}
