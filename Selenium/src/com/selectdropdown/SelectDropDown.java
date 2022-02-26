package com.selectdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver facebook = new ChromeDriver();
		
		facebook.manage().window().maximize();
		facebook.get("https://www.facebook.com/");
		facebook.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
		WebElement date = facebook.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(date);
		s.selectByIndex(24);//---select by 'index' 
		
		WebElement months = facebook.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(months);
		s1.selectByValue("3");//---select by 'value'
		
		WebElement year = facebook.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1995");//--select by 'text'
		
		
	}
}
