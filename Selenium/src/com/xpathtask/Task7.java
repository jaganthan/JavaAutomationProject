package com.xpathtask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver flipkart = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)flipkart;
		Robot r = new Robot();
		flipkart.manage().window().maximize();
		flipkart.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		flipkart.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		flipkart.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("redmi phone");
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		WebElement scroll = flipkart.findElement(By.xpath("(//div[contains(text(),'REDMI Note 10S (Deep Sea Blue, 128 GB)')])[2]"));
		js.executeScript("arguments[0].scrollIntoView('true')", scroll);
		js.executeScript("arguments[0].click()",scroll);
		
		flipkart.getWindowHandle();
		Set<String> childWindow = flipkart.getWindowHandles();
		List<String> getChildWindow = new ArrayList<>();
		getChildWindow.addAll(childWindow);
		flipkart.switchTo().window(getChildWindow.get(1));
		
		Thread.sleep(2000);
		
		WebElement getProductPrice = flipkart.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		String text = getProductPrice.getText();
		System.out.println(text);
		
	}
}
