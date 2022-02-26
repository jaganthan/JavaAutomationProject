package com.xpathtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "F:\\Jagan Project\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Actions move = new Actions(driver);	
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		firstName.sendKeys("jagan");
		
		WebElement lastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastName.sendKeys("nathan");
		
		
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("136,sudharsanam main road,thirumalaivasan nagar, thirumullaivoyal,chennai- 62");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("jagan@gamil.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("8072267883");
		
		WebElement radioBtn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radioBtn.click();
		
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		checkBox1.click();
		
		WebElement checkBox2 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		checkBox2.click();
		
		WebElement checkBox3 = driver.findElement(By.xpath("//input[@id='checkbox3']"));
		checkBox3.click();
		
		WebElement lngClick = driver.findElement(By.xpath("(//div[@id='msdd'])"));
		lngClick.click();
		
		WebElement lngSelect = driver.findElement(By.xpath("//a[text()='English']"));
		move.moveToElement(lngSelect).perform();
		lngSelect.click();
		
		driver.findElement(By.xpath("//div[@class='row ']")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='Skills']")).click();
		driver.findElement(By.xpath("//option[@value='Adobe Photoshop']")).click();
		
		driver.findElement(By.xpath("//div[@class='row ']")).click();
		
		WebElement country = driver.findElement(By.xpath("(//select[@id='countries'])"));
		country.click();
		
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		WebElement typeCountry = driver.findElement(By.xpath("//input[@type='search']"));
		typeCountry.sendKeys("India");
		driver.findElement(By.xpath("//li[@role='treeitem']")).click();
		
		WebElement dateYear = driver.findElement(By.xpath("//select[@placeholder='Year']"));
		dateYear.sendKeys("2022");
	
		WebElement dateMonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		dateMonth.sendKeys("January");
		
		WebElement dateDay = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		dateDay.sendKeys("11");
		
		
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'][1])"));
		password.sendKeys("123456");
		
		WebElement secondPassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		secondPassword.sendKeys("iwueuqwetu");
		
		WebElement refresh = driver.findElement(By.xpath("//button[contains(text(),'Refresh')]"));
		refresh.click();
		
		}
}
