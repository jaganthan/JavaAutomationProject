package com.selectdropdown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetOption {
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
				
				WebDriver leaf = new ChromeDriver();
				
				leaf.manage().window().maximize();
				leaf.get("http://www.leafground.com/pages/Dropdown.html");
				
				WebElement allOptions = leaf.findElement(By.name("dropdown2"));
				Select s = new Select(allOptions);
				
				List<WebElement> getoptions = s.getOptions();//---'getOptions' is one of method in select.
				for (int i = 0; i < getoptions.size(); i++) {
					WebElement allTxtOptions = getoptions.get(i);
					System.out.println(allTxtOptions.getText());//----prints all dropdown list option.
				}
		}
}