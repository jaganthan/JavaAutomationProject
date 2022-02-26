package com.selectdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver fac = new ChromeDriver();
		
		fac.manage().window().maximize();
		fac.get("https://www.facebook.com/");
		
		fac.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(1000);
		WebElement dropdown = fac.findElement(By.xpath("//select[@name='birthday_month']"));
		dropdown.click();
		
		Select s = new Select(dropdown);
		System.out.println(s.isMultiple());//---facebook does not support multiple select option...so the output will be 'false'.
	}
}
