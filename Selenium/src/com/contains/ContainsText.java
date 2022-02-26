package com.contains;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class ContainsText {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver facebook = new ChromeDriver();
		facebook.manage().window().maximize();
		
		facebook.get("http://www.facebook.com");
		
		//contains only text
//		WebElement loginBtn = facebook.findElement(By.xpath("//button[text()='Log In']"));
//		loginBtn.click();
		
		//get attribute name
		WebElement getAttributePass = facebook.findElement(By.xpath("//input[@placeholder='Password']"));
		String attribute = getAttributePass.getAttribute("placeholder");
		System.out.println("Attribute Name : "+ attribute);
		
		//contain partial text
		WebElement forgetBtn = facebook.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		
		//to print label name
		String getText = forgetBtn.getText();
		System.out.println("Text Present : " +getText);
		forgetBtn.click();
		
		
	}
}
