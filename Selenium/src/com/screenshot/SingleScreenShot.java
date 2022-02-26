package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleScreenShot {
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver fac = new ChromeDriver();
		
		fac.manage().window().maximize();
		fac.get("https://www.facebook.com/");
		
		TakesScreenshot ss = (TakesScreenshot)fac;//---Screenshot object creation
		File src = ss.getScreenshotAs(OutputType.FILE);//---Takes Screenshot
		File dest = new File("F:\\Jagan Project\\Selenium\\ScreenShots\\login.png");//---destination location path
		FileUtils.copyFile(src, dest);//----store ss from source to destination location
		

	}
}
