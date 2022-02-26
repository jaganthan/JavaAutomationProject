package com.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ParentClass {
	
	public static Actions a;
	public static WebDriver fac;
	public static void setProperty() {
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		fac =new ChromeDriver();
	}
	public static void toMaximize() {
		fac.manage().window().maximize();
	}
	public static void passUrl(String passUrl) {
		fac.get(passUrl);
	}
	public static void toSendKey(WebElement element,String sendKey) {
		element.sendKeys(sendKey);
	}
	public static void toClick(WebElement element) {
		element.click();

	}
}
