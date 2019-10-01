package com.util;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author ExcelSheet
 * Class for retriving the data from the Excel Sheet
 *
 */
public class ExcelSheet 
{
//	"./ExcelSheet/UserPageExcel.xlsx"
	public static String readDataFromExcel(String sheetName,int rowNumber,int columnNumber,String fileName)
	{
		try 
		{
			File file = new File(fileName);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheetName).getRow(rowNumber).getCell(columnNumber).getStringCellValue();
			return data;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	
}
