package com.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String path=".//data/Book.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Cell printValue = wb.getSheet("Emp_Details").getRow(4).getCell(4);
		
		String res=printValue.toString();
		
		System.out.println(res);
	}
}
