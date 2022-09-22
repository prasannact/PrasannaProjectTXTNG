package org.Tngconcept;

import org.testng.annotations.Test;

public class Groupclass2 {
	
	// it ll show d result sysout while running 
	
	@Test(groups= {"smoke,fire"})  // OR oper any 1 can run d file 
	private void tc11() {
		System.out.println("1");

	}
	
	@Test
	private void tc22() {
		System.out.println("2");

	}
	
	@Test(groups="smoke")   // v use include smoke (or) exclude in XML file
	private void tc33() {
		System.out.println("3");

	}
	
	@Test
	private void tc44() {
		System.out.println("4");

	}
	

}
