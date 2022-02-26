package com.playvideo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeVideoSong2 {
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver youtube = new ChromeDriver();
		youtube.manage().window().maximize();
		Robot r = new Robot();
		youtube.get("https://www.youtube.com/watch?v=74d2Gxum9mI");
		
		youtube.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
		
		Thread.sleep(2000);
		
		youtube.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(2000);
		
		
		
		youtube.findElement(By.xpath("//button[@class='ytp-button ytp-settings-button']")).click();
		
		youtube.findElement(By.xpath("//div[contains(text(),'Quality')]")).click();
		
	}
}
