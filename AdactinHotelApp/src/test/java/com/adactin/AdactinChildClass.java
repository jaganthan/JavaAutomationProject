package com.adactin;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdactinChildClass extends AdactinParentClass{
	public static void main(String[] args) throws IOException, AWTException {
		
		launchBrowser();
		maximize();
		adactin.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getUrl("https://adactinhotelapp.com/");

		//Login Page
		
		WebElement userName = adactin.findElement(By.id("username"));
		passValue(userName, excelDetails(1,0));
		WebElement passWord = adactin.findElement(By.id("password"));
		passValue(passWord, excelDetails(1,1));
		adactin.findElement(By.id("login")).click();
		
		//Next Page 'Room Details'
		
		WebElement location = adactin.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(location);
		s.selectByVisibleText("Paris");
		
		WebElement selectHotel = adactin.findElement(By.id("hotels"));
		Select s1 = new Select(selectHotel);
		s1.selectByVisibleText("Hotel Sunshine");
		
		WebElement selectRoomType = adactin.findElement(By.id("room_type"));
		Select s2 = new Select(selectRoomType);
		s2.selectByVisibleText("Super Deluxe");
		
		WebElement selectNumberRoom = adactin.findElement(By.id("room_nos"));
		Select s3 = new Select(selectNumberRoom);
		s3.selectByVisibleText("3 - Three");
		
		WebElement dateIn = adactin.findElement(By.id("datepick_in"));
		dateIn.click();
		deleteText();
		passValue(dateIn, excelDetails(1, 3));
		
		WebElement dataOut = adactin.findElement(By.id("datepick_out"));
		dataOut.click();
		deleteText();
		passValue(dataOut, excelDetails(1, 4));
		
		WebElement noOfAdult = adactin.findElement(By.id("adult_room"));
		Select s4 = new Select(noOfAdult);
		s4.selectByVisibleText("4 - Four");
		
		WebElement childrenPerRoom = adactin.findElement(By.id("child_room"));
		Select s5 = new Select(childrenPerRoom);
		s5.selectByVisibleText("2 - Two");
		
		adactin.findElement(By.id("Submit")).click();
		
		//Next Page 'select option'
		
		adactin.findElement(By.id("radiobutton_0")).click();
		adactin.findElement(By.id("continue")).click();
		
		//Next Page 'Book Now'
		
		WebElement firstName = adactin.findElement(By.id("first_name"));
		passValue(firstName, excelDetails(1, 5));
		
		WebElement lastName = adactin.findElement(By.id("last_name"));
		passValue(lastName, excelDetails(1, 6));
		
		WebElement billingAddress = adactin.findElement(By.id("address"));
		passValue(billingAddress, excelDetails(1, 7));
		
		WebElement creditCardNumber = adactin.findElement(By.id("cc_num"));
		passValue(creditCardNumber, excelDetails(1, 8));
		
		WebElement creditCardType = adactin.findElement(By.id("cc_type"));
		Select s6 = new Select(creditCardType);
		s6.selectByVisibleText("Master Card");
		
		WebElement expireMonth = adactin.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(expireMonth);
		s7.selectByValue("3");
		
		WebElement exprireYear = adactin.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(exprireYear);
		s8.selectByIndex(12);
		
		WebElement cvvNumber = adactin.findElement(By.id("cc_cvv"));
		passValue(cvvNumber, excelDetails(1, 9));
		
		adactin.findElement(By.id("book_now")).click();
		
		//Next Page 'Order Number'
		
		WebElement getOrderNumber = adactin.findElement(By.id("order_no"));
		JavascriptExecutor js = (JavascriptExecutor)adactin;
		Object printValue = js.executeScript("return arguments[0].getAttribute('value')",getOrderNumber);
		System.out.println(printValue);
	}
}
//*************************************************END***********************************************************************************************************