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
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver amazon = new ChromeDriver();
		amazon.manage().window().maximize();
		amazon.get("https://www.amazon.in/");
		
		Actions a = new Actions(amazon);
		Robot r = new Robot();
		
		amazon.findElement(By.xpath("(//input[@type='text'])")).sendKeys("iphones X");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		 
		Thread.sleep(2000);
		WebElement product1 = amazon.findElement(By.xpath("//span[contains(text(),'Apple iPhone XR 64GB Black (includes EarPods, power adapter)')]"));
		JavascriptExecutor scrollMouse = (JavascriptExecutor)amazon;
		scrollMouse.executeScript("arguments[0].scrollIntoView('true')", product1);
		
		a.contextClick(product1).perform();
		
		for(int i=0; i<=1; i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		amazon.getWindowHandle();
		Set<String> newWindow = amazon.getWindowHandles();
		List<String> idTransfer = new ArrayList<>();
		idTransfer.addAll(newWindow);
		amazon.switchTo().window(idTransfer.get(1));
		
		WebElement getTxt = amazon.findElement(By.xpath("//span[@class='a-price a-text-price a-size-medium apexPriceToPay']"));
		String text = getTxt.getText();
		System.out.println(text);
	}
}
