package org.cts;

import java.io.IOException;

import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class BrowserWthPojo extends BaseClass {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		launchchrome();
		winmaxx();
		loadurll("https://www.clarks.com");
		printtitlee();
		printcurrurll();
		
		sleep();
		
		 LoginPojo l = new LoginPojo();
		 
		 
		 btclick(l.getOk());
		 
		 fill(l.getUser(), getdata(1, 6));
		 
		 fill(l.getPass(), getdata(3, 7));
		 
		 btclick(l.getOk1());
		 
		 
		//to refresh we use this
		 
		 
		 driver.navigate().refresh();
		 
		 
		 LoginPojo li = new LoginPojo();
		 
		 fill(li.getUser(), getdata(1, 6));
		 
		 fill(li.getPass(), "AAAA");
		 
		 btclick(l.getOk1());
		 
		 
		
	}

}
