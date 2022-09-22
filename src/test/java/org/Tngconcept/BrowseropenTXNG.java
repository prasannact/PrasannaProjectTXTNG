package org.Tngconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowseropenTXNG {
	
	
	public static WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	private void tc1(String name ) {
		 
		System.out.println("launching ");   // to test it give output
		
		if (name.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			
		}
		else if (name.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			
		}
		else {
			WebDriverManager.edgedriver().setup();
			 driver= new EdgeDriver();
			
			
		}
		driver.manage().window().maximize();
        driver.get("https://www.clarks.com");
	}
	

}
