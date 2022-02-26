package com.selectdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOption {
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
				
				WebDriver leaf = new ChromeDriver();
				
				leaf.manage().window().maximize();
				leaf.get("http://www.leafground.com/pages/Dropdown.html");
				WebElement allSelectOptions = leaf.findElement(By.name("dropdown2"));
				Select s = new Select(allSelectOptions);
				s.selectByIndex(1);
				
				WebElement get = s.getFirstSelectedOption();
				System.out.println(get.getText());
		}
}