package com.wordpress.config;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {

	XSSFWorkbook wb;
	XSSFSheet sh1;
	
	public ExcelConfig(String excelPath)
	{
		
		File src=new File(excelPath);
		try {
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public String getData(int sheetNo, int row, int column)
	{
		sh1=wb.getSheetAt(sheetNo);
		return sh1.getRow(row).getCell(column).getStringCellValue();
	}
	
	public void closeSheet() throws Exception
	{
		wb.close();
	}
	
}
