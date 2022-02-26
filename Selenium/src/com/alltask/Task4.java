package com.alltask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Task4	 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver icici = new ChromeDriver();
		icici.manage().window().maximize();
		
		icici.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement findId = icici.findElement(By.id("DUMMY1"));
		findId.sendKeys("GreensTechnology");
	
		WebElement findId2 = icici.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
		findId2	.sendKeys("GreensTechnology");	
		
	}
}
