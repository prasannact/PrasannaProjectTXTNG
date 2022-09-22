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

public class JunitOrder extends BaseClass {
	
	@BeforeClass
	public static void launching() {
		launchchrome();
		winmaxx();
		
	}
	
	@Before
	public  void website() {
		loadurll("https://www.clarks.com");
		
		Date d = new Date();
		System.out.println(d);

		
		LoginPojo l = new LoginPojo();
		btclick(l.getOk());

	}
	
	
	@Test
	public  void tc1() throws IOException {
	LoginPojo li = new LoginPojo();
	
	fill(li.getUser(), getdata(1, 6));
	fill(li.getPass(), getdata(3, 7));
	btclick(li.getOk1());
	
	}
	@Ignore
	@Test
	public  void tc2() throws IOException {
		LoginPojo li = new LoginPojo();
		
		fill(li.getUser(), getdata(1, 5));
		fill(li.getPass(), getdata(3, 6));
		btclick(li.getOk1());
		System.out.println( getdata(1, 5));
		
	}
	
	
	@Test
	public  void tc3() throws IOException, InterruptedException {
		
		    sleep();
		   
			LoginPojo li = new LoginPojo();
			
			fill(li.getUser(), getdata(1, 4));
			fill(li.getPass(), getdata(3, 5));
			btclick(li.getOk1());
		
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
