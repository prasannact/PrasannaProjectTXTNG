package org.JunitOrder;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class Assert extends BaseClass{
		
	@BeforeClass
	public static void launching() {
		launchchrome();
		winmaxx();
		
	}
	
	@Before
	public  void website() {
		
		String expe ="clarks shoes official site";
		loadurll("https://www.clarks.com");
		
		Date d = new Date();
		System.out.println(d);

		
		LoginPojo l = new LoginPojo();
		btclick(l.getOk());
		
		String act = driver.getTitle();
		
		org.junit.Assert.assertEquals("not correct ", expe, act);
		System.out.println("passed tc1");

	}
	
	
	@Test
	public  void tc1() throws IOException {
	LoginPojo li = new LoginPojo();
	
	fill(li.getUser(), getdata(1, 6));
	fill(li.getPass(), getdata(3, 7));
	btclick(li.getOk1());
	
	}
	
	@Test
	public  void tc2() throws IOException {
		LoginPojo li = new LoginPojo();
		
		fill(li.getUser(), getdata(1, 5));
		fill(li.getPass(), getdata(3, 6));
		btclick(li.getOk1());
		
		System.out.println( getdata(1, 5));
		
	}
	
	
	@Test
	public  void tc3() throws IOException {
			LoginPojo li = new LoginPojo();
			
			fill(li.getUser(), getdata(1, 4));
			fill(li.getPass(), getdata(3, 5));
			btclick(li.getOk1());
			
			// assert true using 
			
			String currentUrl = driver.getCurrentUrl();
			
			org.junit.Assert.assertTrue("Tc3  failed ", currentUrl.contains("login"));
			 System.out.println("passed tc3" );
		
		}
			
	@After
	public  void starttime() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@AfterClass
	
	public static  void endtime() {
		Date d = new Date();
		System.out.println(d);
		
		System.out.println("Ohhooo");

		}
		

}

