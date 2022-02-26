package com.fullsoftwaretesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullSoftwareTest {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver fac = new ChromeDriver();
		fac.get("http://demo.automationtesting.in/Youtube.html");
		fac.manage().window().maximize();
		
		fac.switchTo().frame(fac.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/wPECeNP1BoY']")));
		fac.findElement(By.xpath("//button[@aria-label='Play']")).click();
		
	}
}
