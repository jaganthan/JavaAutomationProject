package com.selectdropdown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOption {
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
				
				WebDriver leaf = new ChromeDriver();
				
				leaf.manage().window().maximize();
				leaf.get("http://www.leafground.com/pages/Dropdown.html");
				
				WebElement allSelectOptions = leaf.findElement(By.name("dropdown2"));
				Select s = new Select(allSelectOptions);
				s.selectByIndex(3);//---select option based on index value
								
				List<WebElement> l = s.getAllSelectedOptions();
				for (int i = 0; i <l.size(); i++) {
					WebElement getAllselectedOption = l.get(i);
					System.out.println(getAllselectedOption.getText());//----printing selected option

				}
		}
}