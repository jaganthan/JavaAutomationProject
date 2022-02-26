package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

public class MultipleScreenShot {
	
	public static WebDriver fac;
	public static void MultiSs(String ScreenshotName) throws IOException {
	
			TakesScreenshot ts = (TakesScreenshot)fac;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("F:\\Jagan Project\\Selenium\\ScreenShots\\"+ScreenshotName+".png");
			FileUtils.copyFile(src, dest);
	}
		public static void main(String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		fac = new ChromeDriver();
		
		fac.manage().window().maximize();
		fac.get("https://www.facebook.com/");
		
		MultiSs("LoginPage");
		
		fac.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Angel");
		fac.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
		fac.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		
		Thread.sleep(1000);
		
		MultiSs("CreatePage");
		
		
	}
}