package org.Tngconcept;

import org.testng.annotations.Test;

   public class Client {
	   
	   
	 @Test
	private void tc1() {
		System.out.println("zzz");
		
		 // to get mainid thread id 
		 
		System.out.println(Thread.currentThread().getId());
	}
     @Test
     private void tc2() {
		System.out.println("yyy");
		
		System.out.println(Thread.currentThread().getId());

	}
     @Test
   private void tc3() {
	System.out.println("xxx");
	
	System.out.println(Thread.currentThread().getId());
	
 }
     
}

	
   

