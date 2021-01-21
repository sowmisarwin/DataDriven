package org.datadriv;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.baseMethods.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task9and10 extends Base {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		chrome();
		launchUrl("http://www.adactin.com/HotelApp/");
		maxWindow();
		findAndSendUsingId("username", readExcel("adactin", "details", 1, 0));
		findAndSendUsingId("password", readExcel("adactin", "details", 1, 1));
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnClick(btnlogin);
		impicitWait();			
		selectByVisibleText("location", "Sydney");
		selectByVisibleText("hotels", "Hotel Sunshine");
		selectByVisibleText("room_type", "Super Deluxe");
		selectByVisibleText("room_nos", "1 - One");
//		WebElement click = driver.findElement(By.id("datepick_in"));
//		btnClick(click);
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
//		r.keyPress(KeyEvent.VK_DELETE);
//		r.keyRelease(KeyEvent.VK_DELETE);
//		fill(click, readExcel("adactin", "details", 1, 2));
//		WebElement element = driver.findElement(By.id("datepick_out"));
//		btnClick(element);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
//		r.keyPress(KeyEvent.VK_DELETE);
//		r.keyRelease(KeyEvent.VK_DELETE);
//		fill(element, readExcel("adactin", "details", 1, 3));
		selectByVisibleText("adult_room", "2 - Two");
		selectByVisibleText("child_room", "1 - One");
		findAndClick("Submit");
		findAndClick("radiobutton_0");
		findAndClick("continue");
		impicitWait();	
		
		findAndSendUsingId("first_name", readExcel("adactin", "details", 1, 4));
		findAndSendUsingId("last_name", readExcel("adactin", "details", 1, 5));
		findAndSendUsingId("address", readExcel("adactin", "details", 1, 6));
		findAndSendUsingId("cc_num", readExcel("adactin", "details", 1, 7));
		selectByVisibleText("cc_type", "VISA");
		selectByVisibleText("cc_exp_month", "February");
		selectByVisibleText("cc_exp_year", "2021");
		findAndSendUsingId("cc_cvv", readExcel("adactin", "details", 1, 8));
		findAndClick("book_now");
		impicitWait();		
		
		WebElement down = driver.findElement(By.id("search_hotel"));
		scrollIntoView(down);
		impicitWait();
		String attribute = printAttribute("order_no");
		System.out.println("order no."+attribute);
		
//		writeDataInRow("adactin", "details", 0, 10, "order no.");
//		writeDataInRow("adactin", "details", 1, 10, attribute);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}
}
