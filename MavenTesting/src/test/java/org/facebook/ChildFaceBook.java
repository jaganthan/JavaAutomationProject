package org.facebook;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChildFaceBook extends FaceBook {
	public static void main(String[] args) throws IOException  {
		launchBrowser();
		toMaximize();
		passUrl("https://facebook.com");
		WebElement email = fac.findElement(By.id("email"));
		toInput(email, excelGetDetails(2, 0));
		WebElement password = fac.findElement(By.id("pass"));
		toInput(password, excelGetDetails(1, 1));
	}
}