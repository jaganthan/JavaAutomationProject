package com.frameworkpara;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseclassPara {
	public static WebDriver adactin;
	public static void maximize() {
		adactin.manage().window().maximize();
	}
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		adactin = new ChromeDriver();
	}
	public static void getUrl(String value)
	{
		adactin.get(value);
	}
	public static void toInput(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	public static void buttonClick(WebElement element) 
	{
		element.click();
	}
	public static String excelSheet(int indexRow, int indexCell) throws IOException
	{
		File file = new File("F:\\Jagan Project\\TestNG\\Datas\\DataSheetAdactin.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook format = new XSSFWorkbook(f);
		Sheet s = format.getSheet("Sheet1");
		Row r = s.getRow(indexRow);
		Cell c = r.getCell(indexCell);
		int cellType = c.getCellType();
		String value;
		if(cellType==1)
		{
			value = c.getStringCellValue();
		}
		else if(DateUtil.isCellDateFormatted(c))
		{
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/MM/YYYY");
			value = sim.format(d);
		}
		else
		{
			double numeric = c.getNumericCellValue();
			long l = (long)numeric;
			value= String.valueOf(l);
		}
		return value;
	}
}
