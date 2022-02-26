package com.windowsswitch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutForLoop {
	public static Actions a;
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver snapDeal = new ChromeDriver();
		Robot r = new Robot();
		snapDeal.manage().window().maximize();
		
		snapDeal.get("https://www.snapdeal.com/");
		
		snapDeal.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("sanitizer");
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		snapDeal.findElement(By.xpath("//img[@title='Germi Fight Insta-Protection with alcohol based Hand Sanitizer Bottle 500 ml']")).click();
		
		String parentId = snapDeal.getWindowHandle();//----calling method
		System.out.println(parentId);//---to print parent browser ID
		
		Set<String> allWindowsId = snapDeal.getWindowHandles();//--using set because it will not allow duplicates
		System.out.println(allWindowsId);//----to print child browser ID
		
		List<String> getWindowId = new ArrayList<>();
		getWindowId.addAll(allWindowsId);//---add the set details into list
		
		//Switching Windows using index value----index starts from 0 1 2 3.....
		snapDeal.switchTo().window(getWindowId.get(1));
		
		snapDeal.findElement(By.xpath("//span[contains(text(),'add to cart')]")).click();
		
	}
}