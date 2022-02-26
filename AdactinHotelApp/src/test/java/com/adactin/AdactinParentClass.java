package com.adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinParentClass {
	public static Actions a;
	public static WebDriver adactin ; 
	public static void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			adactin = new ChromeDriver();
	}
	public static void maximize() {
		adactin.manage().window().maximize();
	}
	public static void getUrl(String getUrl) {
		adactin.get(getUrl);
	}
	public static void passValue(WebElement element, String data)
	{
		element.sendKeys(data);
	}
	public static void deleteText() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
	}
	public static String excelDetails(int row,int cell) throws IOException
		{
		File filePath = new File("F:\\Jagan Project\\AdactinHotelApp\\Datas\\ExcelDataSheet.xlsx");
		FileInputStream readFile = new FileInputStream(filePath);
		Workbook fileFormat = new XSSFWorkbook(readFile);
		Sheet sheet = fileFormat.getSheet("Sheet1");
		Row getRow = sheet.getRow(row);
		Cell getCell = getRow.getCell(cell);
		int cellType = getCell.getCellType();
		String getValue;
		if(cellType==1)
		{
			getValue = getCell.getStringCellValue();
		}
		else if(DateUtil.isCellDateFormatted(getCell))
		{
			Date getDate = getCell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
			getValue=dateFormat.format(getDate);
		}	
		else
		{
			double b = getCell.getNumericCellValue();
			long l =(long)b;
			getValue = String.valueOf(l);
		}
		return getValue;
	}
}
