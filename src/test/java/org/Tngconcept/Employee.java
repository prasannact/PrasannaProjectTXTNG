package org.Tngconcept;

import org.testng.annotations.Test;

public class Employee {
	
	@Test
	private void tc11() {
		
		long id = Thread.currentThread().getId();  // to get mainid thread ID
		 
		System.out.println("aaa");
		
		System.out.println(id);
	

	}
     @Test
     private void tc22() {
		System.out.println("bbb");
		
		System.out.println(Thread.currentThread().getId());
		

	}
     @Test
   private void tc33() {
	System.out.println("ccc");
	
	System.out.println(Thread.currentThread().getId());
	
   }
     
}
