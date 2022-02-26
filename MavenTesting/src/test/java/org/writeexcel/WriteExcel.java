package org.writeexcel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteExcel {
	public static void main(String args[]) throws IOException
	{
		File file = new File("F:\\Jagan Project\\MavenTesting\\datas\\WriteExcelSheet.xlsx");//--creating a excel file path
		Workbook format = new XSSFWorkbook();//---implementation used to work with newer XML Based file format like .xsls
		Sheet createSheet = format.createSheet("Sheet1");//---specifying which sheet to write
		Row r = createSheet.createRow(0);//---specifying which row to write
		Cell c = r.createCell(0);//---specifying which column(cell) to write
		c.setCellValue("JothiLakshmi");//---text to write in excel
		FileOutputStream f = new FileOutputStream(file);//----to throw th output text value
		format.write(f);//---to wrtie the text in excel
	}
}
