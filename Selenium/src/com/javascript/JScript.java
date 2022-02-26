package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class JScript {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver fac = new ChromeDriver();
		Actions a = new Actions(fac);
		
		fac.manage().window().maximize();
		fac.get("http://www.facebook.com");
		JavascriptExecutor js = (JavascriptExecutor)fac;//----object declaration
		
		WebElement userName = fac.findElement(By.name("email"));
		js.executeScript("arguments[0].setAttribute('value','jagan')",userName);//--to type value(send Key)
		a.doubleClick(userName).perform();//-----doubleclick targeted area
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')",userName );//----to print print value 
		System.out.println(executeScript);//---print value(output)
		
		WebElement passName = fac.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','123456')", passName);
		Object executeScript1= js.executeScript("return arguments[0].getAttribute('value')", passName);
		System.out.println(executeScript1);
		
		WebElement btnClick = fac.findElement(By.xpath("//button[text()='Log In']"));
		js.executeScript("arguments[0].click()", btnClick);//----button click using javascript
	
		
		
 	}
}