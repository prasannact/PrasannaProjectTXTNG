package org.Tngconcept;


import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

public class ReRun {
	
	@Test
	private void tc2() {
		System.out.println("aaa");
	}
	
	

	@Test
	private void tc3() {
		System.out.println("xxx");
	}
	
	@Test                   // in this v using I annotion Transformer in XML file
	private void tc6() {
		 assertTrue(false, "opps");
		System.out.println("NNN");

	}
	
	/*
	@Test(retryAnalyzer=Failed.class)	// for IRetryAnalyzer  analyzer this TC
	private void tc4() {
		assertTrue(false, "failed");
		System.out.println("zzz");
	} */
	
	
	@Test
	private void tc1() {
		System.out.println("bbb");
	}
	
}
