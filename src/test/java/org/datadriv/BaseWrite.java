package org.datadriv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Documented;

import org.apache.commons.exec.DaemonExecutor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.dom4j.dom.DOMAttributeNodeMap;
import org.omg.PortableInterceptor.SUCCESSFUL;

public class BaseWrite {
	public static void writeDataNewRow(String fname, String sheet, int createRow, int rowNo, int cellNo, String insertvalue) throws IOException {
		File f=new File("C:\\Users\\Hi\\eclipse-workspace\\MavenProject\\Excelnote\\"+fname+".xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet s=w.getSheet(sheet);
		s.createRow(createRow);
		s.getRow(rowNo).createCell(cellNo).setCellValue(insertvalue);
		FileOutputStream fout=new FileOutputStream(f);
		w.write(fout);
		System.out.println("Done succesfully!!!!!!!");
		
		
		
		
		
		
		
		
		
	}
}
