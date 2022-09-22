package org.cts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class BrowserExecute extends BaseClass{

	public static void main(String[] args) throws InterruptedException, AWTException {
		
	launchchrome();
	winmaxx();
	loadurll("https://www.clarksusa.com/");
	printtitlee();
	printcurrurll();
	
	WebElement ok = driver.findElement(By.xpath("//a[@data-test='header-login-link']"));
	btclick(ok);
	
	sleep();
	
	  WebElement user = driver.findElement(By.xpath("//input[@id='j_username']"));
		fill(user, "prasanna");
		
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='j_password']"));
		fill(pass, "1234");
		
		WebElement ok1 = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		btclick(ok1);
		
		
	}

		
	}
	
	
	
	
	
	
	
	
	
	
	

