package org.Tngconcept;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class DataProvider extends BaseClass {
	

	  @BeforeClass
	   private void browselaunch() {
		launchchrome();
		winmaxx();
		
	 }
	
	 @BeforeMethod
	  private  void website() {
		loadurll("https://www.clarks.com");
		
		Date d = new Date();
		System.out.println(d);

		
		LoginPojo l = new LoginPojo();
	    btclick(l.getOk());

	}
	 
	
	
	
	@Test(priority= -5, dataProvider="login",dataProviderClass=Dataprov_empl.class) // give DP class name to run this   
	
	private  void tc1(String s1,String s2) throws IOException, InterruptedException {
	
	sleep();
	
	LoginPojo li = new LoginPojo();
	
	fill(li.getUser(), s1);
	fill(li.getPass(), s2);
	btclick(li.getOk1());
	
	}
	@Parameters("chiyan")   // by using optional v can insert value what v want
	@Test(enabled = false)  // to ignore case
	private   void tc2(@Optional("CTTT")String s1 ) throws IOException, InterruptedException {
		
		  sleep();
		  
		LoginPojo li = new LoginPojo();
		
		fill(li.getUser(), s1);
		fill(li.getPass(), getdata(3, 6));
		btclick(li.getOk1());
		System.out.println( getdata(1, 5));
		
	}
	
	
	@Test(invocationCount=2, enabled=false) // to run particular TC for N num of times
	private  void tc3() throws IOException, InterruptedException {
		
		     sleep();
		   
			LoginPojo li = new LoginPojo();
			
			fill(li.getUser(), getdata(1, 6));
			fill(li.getPass(), getdata(2, 7));
			btclick(li.getOk1());
			
		}
	
	@AfterMethod
	 private void sattime() {
		System.out.println(new Date());

	}
	
			
	@AfterClass
	private void starttime() {
		 
		System.out.println(new Date());
		
		System.out.println("Ohhho");
	
	}
	
	
	
	
	
	

}
