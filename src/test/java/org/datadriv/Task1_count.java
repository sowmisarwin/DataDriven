package org.datadriv;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.baseMethods.Base;

public class Task1_count extends Base {
	public static void main(String[] args) throws IOException {
		
			Sheet sName = openFile("BOOK2","sheet1");
			int rows = sName.getPhysicalNumberOfRows();
			System.out.println("No.of rows:"+rows);
		
			Row row = sName.getRow(0);
			int cells = row.getPhysicalNumberOfCells();
			System.out.println("No.of cells:"+cells);
			
			int count=0;
			for (int i = 0; i < rows; i++) {
				Row row1 = sName.getRow(i);
				int cell1 = row.getPhysicalNumberOfCells();
				count=count+cell1;
			}
			System.out.println("Total no. of cells in a sheet:"+count);
		}
}
