package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrtTxtTable {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver w3School = new ChromeDriver();
		
		w3School.manage().window().maximize();
		w3School.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = w3School.findElement(By.id("customers"));//--getting id information into 'tabel'
		
		List<WebElement> row = table.findElements(By.tagName("tr"));//--'tr' information is present inside 'tabel' (so getting 'tr' information from 'table' to 'row'
		//row.size----is the length of tabel row present
		for (int i = 0; i < row.size(); i++) {
			WebElement getRow = row.get(i);//----'getText' method only present inside webelement (so getting 'row' infomation into 'getRow' variable by using '.get(index)')
			List<WebElement> getAllRow = getRow.findElements(By.tagName("th"));//--'th' present inside 'tr' (so getting 'th' information form 'getRow' into 'getAllRow' variable)
			for (int j = 0; j < getAllRow.size(); j++) {
				WebElement headings = getAllRow.get(j);//--using weelement getting 'getAllRow.size' information into variable 'headings'
				System.out.println(" "+headings.getText());//--printing the text
				//--above print only row
			}
		//---to print 'td' text present inside 'tr'
		List<WebElement> getData = getRow.findElements(By.tagName("td"));//--Now 'tr' information present in 'getRow' ( So transfer 'getRow' information into 'getData' Variable)
		for (int j = 0; j <getData.size(); j++) {
			WebElement allData = getData.get(j);//--Now 'getData' Transfer information to WebElement Variable 'allData' using '.get(index)' method
			System.out.println(" "+allData.getText());//---printing 'td' text
				}
			}
		}
}	
