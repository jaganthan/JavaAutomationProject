package com.xpathtask;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	public static void main(String[] args)  throws InterruptedException{
System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com/trains");
		
		driver.findElement(By.xpath("//input[@title='From station']")).sendKeys("chennai");
		driver.findElement(By.xpath("//input[@title='To station']")).sendKeys("goa");
		Thread.sleep(800);
		driver.findElement(By.xpath("//select[@id='trainClass']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'AC First Class (1A)')]")).click();
		driver.findElement(By.xpath("//input[@title='Journey date']")).sendKeys("25/03/1995");
		driver.findElement(By.xpath("//select[@name='adults']")).click();
		driver.findElement(By.xpath("(//option[text()='2'])[1]")).click();
		driver.findElement(By.xpath("//select[@name='children']")).click();
		driver.findElement(By.xpath("(//option[text()='3'])[2]")).click();
		driver.findElement(By.xpath("(//select[@class='span span24'])[3]")).click();
		driver.findElement(By.xpath("(//option[text()='3'])[3]")).click();
		driver.findElement(By.xpath("(//select[@class='span span24'])[4]")).click();
		driver.findElement(By.xpath("(//option[text()='3'])[4]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
