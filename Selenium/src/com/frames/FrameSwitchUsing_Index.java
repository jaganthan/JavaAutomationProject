package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitchUsing_Index {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
	WebDriver guru = new ChromeDriver();
	
	guru.manage().window().maximize();
	guru.get("https://demo.guru99.com/test/guru99home/");
	
	//Index Frame switch will work only if the Index Value in Static
	guru.switchTo().frame(3);//--will not work because of dynamic index value
	guru.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
	}
}