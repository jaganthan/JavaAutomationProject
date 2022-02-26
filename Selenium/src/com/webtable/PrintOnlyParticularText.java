package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintOnlyParticularText {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver w3School = new ChromeDriver();
		
		w3School.manage().window().maximize();
		w3School.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = w3School.findElement(By.id("customers"));
		List<WebElement> getTableList = table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < getTableList.size(); i++) {
			WebElement trList = getTableList.get(i);
			
			List<WebElement> tdGet = trList.findElements(By.tagName("td"));
			for (int j = 0; j < tdGet.size(); j++) {
				WebElement tdTxt = tdGet.get(j);
				String tdGetTxt = tdTxt.getText();
				
				if(tdGetTxt.contains("Germany"))
				{
					System.out.println(tdGetTxt);
				}
				
			}
		}
	}
}