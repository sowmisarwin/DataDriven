package org.datadriv;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.baseMethods.Base;

public class Task5 extends Base {
	public static void main(String[] args) throws IOException {
		Sheet openFile = openFile("adactin", "details");
	//	System.out.println(openFile);
		//1st row
		writeDataNewRow("adactin", "details", 0, 0, 0, "UserName");
		writeDataInRow("adactin", "details", 0, 1, "password");
		writeDataInRow("adactin", "details", 0, 2, "check in date");
		writeDataInRow("adactin", "details", 0, 3, "check out date");
		writeDataInRow("adactin", "details", 0, 4, "First Name");
		writeDataInRow("adactin", "details", 0, 5, "Last Name");
		writeDataInRow("adactin", "details", 0, 6, "Billing Address");
		writeDataInRow("adactin", "details", 0, 7, "credit card no.");
		writeDataInRow("adactin", "details", 0, 8, "cvv no.");

		//2nd row
		writeDataNewRow("adactin", "details", 1, 1, 0, "sowmi");
		writeDataInRow("adactin", "details", 1, 1, "sss*123");
		writeDataInRow("adactin", "details", 1, 2, "01/01/2021");
		writeDataInRow("adactin", "details", 1, 3, "05/01/2021");
		writeDataInRow("adactin", "details", 1, 4, "sowntharya");
		writeDataInRow("adactin", "details", 1, 5, "sarwin");
		writeDataInRow("adactin", "details", 1, 6, "chennai");
		writeDataInRow("adactin", "details", 1, 7, "1234567890123456");
		writeDataInRow("adactin", "details", 1, 8, "123");
		System.out.println("done!!!!!!!!!!!!!");
		
		
		
	}
}
