package com.juitframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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

public class BaseClass {
	
	public static WebDriver adactin;
	public static void maximize() {
		adactin.manage().window().maximize();
	}
	public static void launchBrowser() {
	
		WebDriverManager.chromedriver().setup();
		adactin = new ChromeDriver();
	}
	public static void waitTime()
	{
		adactin.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public static void passUrl(String url)  {
		adactin.get(url);
	}
	public static String getAttribute(WebElement element)
	{
		String attribute = element.getAttribute("value");
		return attribute;
	}
	public static void sendTxt(WebElement element, String k) {
		element.sendKeys(k);
	}
	public static void buttonClick(WebElement element) {
		element.click();
	}
	public static String excelSheet(int indexRow, int indexCell) throws IOException{
		File file = new File("F:\\Jagan Project\\AdactinHotelPojo\\Datas\\ExcelDataSheet.xlsx");
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
