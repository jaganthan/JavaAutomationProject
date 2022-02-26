package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSele {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver alert = new ChromeDriver();
		
		alert.manage().window().maximize();
		alert.get("http://demo.automationtesting.in/Alerts.html");
		
		alert.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		alert.findElement(By.xpath("//button[contains(text(),'    click the ')]")).click();
		
		Alert clickAlert1 = alert.switchTo().alert();
		clickAlert1.accept();
		
		Thread.sleep(1000);
		
		alert.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		alert.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert clickAlert2 = alert.switchTo().alert();
		clickAlert2.dismiss();
		
		Thread.sleep(1000);
		
		alert.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		alert.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		
		alert.switchTo().alert().sendKeys("Jaganathan");
		Alert alert2 = alert.switchTo().alert();
		alert2.accept();
		
	
	}
}
