package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitchString {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver guru = new ChromeDriver();
		
		guru.manage().window().maximize();
		guru.get("https://demo.guru99.com/test/guru99home/");
		
		//using String id
		//Step 1: (Switch to frame)
		guru.switchTo().frame("a077aa5e");//---entering into frame using 'id or name attribute value'
		
		//Step 2: (perform operation(click) using xpath
		guru.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();//----using xpath clicking the locator 
		
	}
}
