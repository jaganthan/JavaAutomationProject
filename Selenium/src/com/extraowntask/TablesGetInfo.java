package com.extraowntask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesGetInfo {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver demoTable = new ChromeDriver();
		demoTable.manage().window().maximize();
		demoTable.get("https://info.sice.indiana.edu/~hrosenba/Demo/Demo4.html");
				
		WebElement table = demoTable.findElement(By.xpath("(//table[@width='75%'])[1]"));
		
		List<WebElement> trGet = table.findElements(By.tagName("tr"));
		for (int i = 0; i < trGet.size(); i++) {
			WebElement trText = trGet.get(i);
			List<WebElement> thGet = trText.findElements(By.tagName("th"));
			for (int j = 0; j < thGet.size(); j++) {
				WebElement thPrt = thGet.get(j);
				String s =thPrt.getText();
				if(s.contains("Students"))
				{
					System.out.println(s);
				}
			}
			
		}
	}
}