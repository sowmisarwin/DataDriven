package org.datadriv;

import java.io.IOException;

import org.baseMethods.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task6and7 extends Base {
	public static void main(String[] args) throws IOException {
		chrome();
		launchUrl("https://www.facebook.com/");
		maxWindow();
		findAndSendUsingId("email", readExcel("fb", "details", 1, 0));
		findAndSendUsingId("pass", readExcel("fb", "details", 1, 1));

		WebElement click = driver.findElement(By.id("u_0_b"));
		btnClick(click);
		//print error msg
		WebElement msg = driver.findElement(By.xpath("//div[contains(text(),'match')]"));
		String printText = printText(msg);
		System.out.println(printText);
		
		//write error msg in excel
		writeDataInRow("fb", "details", 0, 2, "Error msg");
		writeDataInRow("fb", "details", 1, 2, printText);
		
		
		
		
		
		
		
		
		
		
}
}
