package org.cts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		driver.get("https://www.clarksusa.com/");
		
	}

}
