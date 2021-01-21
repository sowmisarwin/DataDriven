package org.datadriv;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExample {
	public static void main(String[] args) throws IOException {
		File fileName=new File("C:\\Users\\Hi\\eclipse-workspace\\MavenProject\\Excelnote\\Book1.xlsx");
		
		FileInputStream toReadExcelFile=new FileInputStream(fileName);
		
		Workbook toReadFile=new XSSFWorkbook(toReadExcelFile);		
		
		Sheet sheets = toReadFile.getSheet("sheet1");
		
		for (int i = 0; i < sheets.getPhysicalNumberOfRows(); i++) {
			Row rowAll = sheets.getRow(i);
			for (int j = 0; j < rowAll.getPhysicalNumberOfCells(); j++) {
				Cell cells = rowAll.getCell(j);
				System.out.println(cells);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		File filename=new File("C:\\Users\\Hi\\eclipse-workspace\\MavenProject\\Excelnote\\Book1.xlsx");
//		FileInputStream toReadExcelFile=new FileInputStream(filename);
//		Workbook toReadFile=new XSSFWorkbook(toReadExcelFile);
//		
//		Sheet sheet = toReadFile.getSheet("sheet1");
//		
//		int numberOfRows = sheet.getPhysicalNumberOfRows();
//		System.out.println("No. of rows: "+numberOfRows);
//		
//		Row row = sheet.getRow(0);
//		int numberOfCells = row.getPhysicalNumberOfCells();
//		System.out.println("No. of columns: "+numberOfCells);
//		
//		
		
		
	}	
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		XSSFWorkbook  w= new XSSFWorkbook(toReadExcelFile);
//		
//		XSSFSheet at = w.getSheetAt(0);
//		
//		XSSFCell cell = at.getRow(1).getCell(1);		
//		System.out.println(cell);
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		File fileName=new File("C:\\Users\\Hi\\eclipse-workspace\\MavenProject\\Excelnote\\Book1.xlsx");
//		
//		FileInputStream toReadExcelFile=new FileInputStream(fileName);
//		
//		Workbook toReadFile=new XSSFWorkbook(toReadExcelFile);
//		
//		Sheet sheet=toReadFile.getSheet("sheet1");
//		
//		Row rows = sheet.getRow(2);
//		Cell cells = rows.getCell(1);
//		System.out.println(cells);
//		System.out.println("Done successfully");
//		
//		
		
		
		
		
		
	
	
	
	
	
	
		