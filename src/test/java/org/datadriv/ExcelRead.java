package org.datadriv;

import java.io.IOException;

import org.baseMethods.Base;

public class ExcelRead extends Base{
		public static void main(String[] args) throws IOException {
		
			
			
		String readExcel = readExcel("Book1","sheet1", 2, 1);
		System.out.println(readExcel);
		
		System.out.println("done!!!!!!!!!!");
		
		}
		
	}


