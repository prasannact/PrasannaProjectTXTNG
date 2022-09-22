package org.cts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class BrowserWthExcellOpen extends BaseClass {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		launchchrome();
		winmaxx();

		printtitlee();
		printcurrurll();
		
		WebElement ok = driver.findElement(By.xpath("//a[@data-test='header-login-link']"));
		btclick(ok);
		
		sleep();
		
		WebElement user = driver.findElement(By.xpath("//input[@id='j_username']"));
		fill(user, getdata(1, 6));
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='j_password']"));
		fill(pass, getdata(3, 7));
		
		WebElement ok1 = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		btclick(ok1);
	}
	

}
