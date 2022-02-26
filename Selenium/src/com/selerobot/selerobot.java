package com.selerobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selerobot {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);//----used for only mouse function
		Robot r = new Robot();//----used only for keyboard key function
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
		
		//press Key---------------------------------type text-----------------------release key------
		a.keyDown(userName, Keys.SHIFT).sendKeys(userName,"jaganathan").keyUp(userName,Keys.SHIFT);//-----to type text in capitial
		//a.sendKeys(userName,"jaganathan").perform();//-------type text "jaganathan"
		
		a.doubleClick().perform();
		a.contextClick().perform();
		
		for(int i=0; i<3; i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
	
			
	}
}
