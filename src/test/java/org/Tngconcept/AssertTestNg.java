package org.Tngconcept;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTestNg {
	
	@Test
	private void tc1() {
		System.out.println("kamal");

	}
	
	
	@Test
	private void tc2() {
		SoftAssert s = new SoftAssert(); //  condition false also it ll print d nxt line and TC ll pass
		s.assertTrue(false, "outtt");
		System.out.println("rajini");
		
		s.assertAll();    //it behaves like hard assert , if conditon fails it ll terminate d nxt line and wont pass d  TC
		
		System.out.println("opps");

	}
	
	
	@Test
	private void tc3() {
		Assert.assertTrue(true, "out");
		System.out.println("ajith");
		
		SoftAssert s1 = new SoftAssert();
		s1.assertAll();       // it behaves like hard assert , if conditon fails it ll terminate d nxt line and wont pass d  TC
		
		System.out.println("Ohho");
		
	

	}
	
	@Test
	private void tc4() {
		System.out.println("vikram");

	}
	
	
	
	
	
	
	

}
