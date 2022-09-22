package org.Tngconcept;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.utilities.BaseClass;

public class Dataprov_empl extends BaseClass {
	
	@DataProvider(name="login")
	private Object[][] dataMethod() throws IOException {
		
		
		return new Object[][] {
			
			{getdata(0, 1),getdata(0, 2)},
			{getdata(1, 1),getdata(1, 3)},
			{getdata(2, 2),getdata(2, 5)},
			
			
		};
			

	}
	
}
