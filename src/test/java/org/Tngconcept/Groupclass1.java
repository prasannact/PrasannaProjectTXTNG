package org.Tngconcept;

import org.testng.annotations.Test;

public class Groupclass1 {
	
	@Test(groups="smoke")
	private void tc1() {
		System.out.println("11");

	}
	
	@Test
	private void tc2() {
		System.out.println("22");

	}
	
	@Test
	private void tc3() {
		System.out.println("33");

	}
	
	
	@Test(groups= {"smoke,fire"})  // AND operator both needs to correct to run d file
	private void tc4() {
		System.out.println("44");

	}
	

}
