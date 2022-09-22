package org.Tngconcept;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer{
	
	int min=0,max=2;

	public boolean retry(ITestResult arg0) {
		
		if (min<max) {
			min++;
			return true;
			
		}
		
		return false;
	}
	

}
