package org.cts;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class PojoClass extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		launchchrome();
		winmaxx();
		loadurll("https://www.clarks.com");
		printtitlee();
		printcurrurll();
		
		// Use pojo method here
		
	   LoginPojo l = new LoginPojo();
	   
	 // here v can get the getters by L.get--;
	   
	   
	    btclick(l.getOk());
	  
		fill(l.getUser(), getdata(1, 6));
		  
		fill(l.getPass(), getdata(3, 7));
		
		btclick(l.getOk1());
	
		
	}
	

}
