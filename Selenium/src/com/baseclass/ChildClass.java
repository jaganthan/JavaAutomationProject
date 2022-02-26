package com.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChildClass extends ParentClass{
	public static void main(String[] args) {
		
		setProperty();
		toMaximize();
		passUrl("https://facebook.com");
		WebElement email = fac.findElement(By.id("email"));
		toSendKey(email, "manijagan2595@gmail.com");
		WebElement pass = fac.findElement(By.id("pass"));
		toSendKey(pass, "jagan@123");
		fac.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
	}
}
