package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;  // to global level access
	
	public static Actions a;          // to global level access
	
	public static Robot r ;
	
	public static void launchchrome() {
	WebDriverManager.chromedriver().setup();
    driver =new ChromeDriver();	
}
	public static void winmaxx() {
		driver.manage().window().maximize();
		
	}
	
	public static void loadurll(String url) {
		driver.get(url);

	}
	public static void printtitlee() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	public static void printcurrurll() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}
	public static void fill(WebElement ele ,String value) {
    	 
    	 ele.sendKeys(value);

	}
	public static void btclick(WebElement ele) {
		
		ele.click();
		
	}
     
	public static void winclose() {
		driver.close();

	}
  
	public static void winquit() {
		driver.quit();
	}
     
	public static void gettextname(WebElement ele) {
    
    	 System.out.println(ele.getText());	
	}
     
	public static void getattriname(WebElement ele , String name) {
    	
    	 System.out.println(ele.getAttribute(name));
   	 
	}
     
	 public static void sleep() throws InterruptedException {
		Thread.sleep(2000);

	}
     
	 public static void rclk(WebElement ele) {
		
		a= new Actions(driver);
		
	    a.contextClick(ele);
	
	}
	 public static void dcli(WebElement ele) {
		a.doubleClick(ele);
		
	}
	 public static void movetoele(WebElement ele) {
		a.moveToElement(ele);
		
	}
	 public static void keypress() throws AWTException {
		r.keyPress(KeyEvent.VK_DOWN);

	    r = new Robot();
	
	 } 
	 public static  void keyrelesee() {
		r.keyRelease(KeyEvent.VK_DOWN);

	}
	 // EXCELL SHEET fillings used in base class this one 
	 
	 public static  String getdata(int rownumber,int cellnumber) throws IOException {
		 
		 File f = new File("C:\\Users\\prsannt\\eclipse-workspace\\ProjectFrameWork\\src\\test\\resources\\Excell\\excell proj.xlsx");
			
			FileInputStream finput = new FileInputStream(f);
			
			Workbook w = new XSSFWorkbook(finput);
			
			Sheet s = w.getSheet("project");
			
			Row r = s.getRow(rownumber);
			
			Cell c = r.getCell(cellnumber);
			
			int cellType = c.getCellType();
			
			String value="";
			
			if (cellType==1) {
				 value = c.getStringCellValue();
				
			}
			else if (DateUtil.isCellDateFormatted(c)) {
				
				Date d = c.getDateCellValue();
				SimpleDateFormat simdatefr = new SimpleDateFormat("dd,mmm, yyyy,z ");
				 value = simdatefr.format(d);
				
			}
			else {
				double d = c.getNumericCellValue();
				long l = (long)d;
				value = String.valueOf(l);
				
			}
			return value;
			
		
	}
	}
	
	
	
	
	
	

