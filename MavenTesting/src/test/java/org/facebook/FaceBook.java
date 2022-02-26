package org.facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static WebDriver fac;
	public static Actions a;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		fac =new ChromeDriver();
	}
	public static void toMaximize() {
		fac.manage().window().maximize();
	}
	public static void passUrl(String passUrl) {
		fac.get(passUrl);
	}
	public static void toInput(WebElement element,String sendKey) {
		element.sendKeys(sendKey);
	}
	public static void toClick(WebElement element) {
		element.click();
	}
	public static String excelGetDetails(int row,int cells) throws IOException {
		File file = new File("F:\\Jagan Project\\MavenTesting\\datas\\ExcelDataSheet.xlsx");//----Excel File path
		FileInputStream read = new FileInputStream(file);//----read excel path
		Workbook excelFormat = new XSSFWorkbook(read);//---Excel File Format read
		Sheet sheet = excelFormat.getSheet("Sheet1");//---specifing SheetNo.
		Row r = sheet.getRow(row);//----get row value using 'index'
		Cell c = r.getCell(cells);//---get cell value using 'index'
		int cellType = c.getCellType();//---get all the cell type
		String getValue;
		if(cellType==1)//--if type is equal to 1 is String 
		{
			getValue = c.getStringCellValue();//---getString value if above condition is true
		}
		else if(DateUtil.isCellDateFormatted(c))//----check date format
		{
			//Date date = c.getDateCellValue();//--is above true will get date cell value
			SimpleDateFormat checkFormat = new SimpleDateFormat("dd-mm-yyyy");//----specifying our own date format
			getValue = checkFormat.format(c);//--check above date format in avaliable in excel
		}
		else//---if all condition is false
		{
			double numericCellValue = c.getNumericCellValue();//--check the numeric value
			long convertLong = (long)numericCellValue;//---concert double into long to avoid decimal point
			getValue=String.valueOf(convertLong);//---get the converted value
		}
		return getValue;	
	}
}