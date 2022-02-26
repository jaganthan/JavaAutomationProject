package com.mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveAction {
	public static void main(String[] args) throws InterruptedException{
		
System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement drag = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
		WebElement drop = driver.findElement(By.xpath("//ol[@id='bank']"));
		a.dragAndDrop(drag, drop).perform();
		Thread.sleep(1000);
		a.contextClick(drag).perform();
			
		WebElement amtDrag = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement amtDrop = driver.findElement(By.xpath("//ol[@id='amt7']"));
		a.dragAndDrop(amtDrag, amtDrop).perform();
		
	}
}
