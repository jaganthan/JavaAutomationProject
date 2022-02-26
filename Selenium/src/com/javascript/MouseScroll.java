package com.javascript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseScroll {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver fac = new ChromeDriver();
	Actions a = new Actions(fac);
	Robot r = new Robot();
	fac.manage().window().maximize();
	fac.get("https://www.javatpoint.com/java-int-to-long");
	
	JavascriptExecutor js = (JavascriptExecutor)fac;
	
	WebElement findElement = fac.findElement(By.xpath("(//div[@class='homecontent'])[3]"));
	js.executeScript("arguments[0].scrollIntoView('true')", findElement);//---scrolls to sepecified targeted webelement
	
	Thread.sleep(1000);
	
	WebElement rightClick = fac.findElement(By.xpath("//p[text()='ReactJS']"));
	a.contextClick(rightClick).perform();
	
	Thread.sleep(1000);
	
	// to take screen shot
	r.keyPress(KeyEvent.VK_WINDOWS);
	r.keyPress(KeyEvent.VK_PRINTSCREEN);
	r.keyRelease(KeyEvent.VK_WINDOWS);
	r.keyRelease(KeyEvent.VK_PRINTSCREEN);
	
	
}
}
