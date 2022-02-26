package com.frames;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameSwitchUsing_WebElement {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver guru = new ChromeDriver();
		
		guru.manage().window().maximize();
		guru.get("https://demo.guru99.com/test/guru99home/");
		
		//Switching to Frame WebElement using SINGLE Line of code.
		guru.switchTo().frame(guru.findElement(By.xpath("//iframe[@src='ads.html']")));//----switching frame
		guru.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();//----performing actions click after frame switch

		
		//Switching to Frame WebElement Using two line of code.
//		WebElement frame = guru.findElement(By.xpath("//iframe[@src='ads.html']"));//---create refname for iframe webelement
//		guru.switchTo().frame(frame);//----switching to frame using web element ref name
//		guru.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();//----performing Click action
	}
}
