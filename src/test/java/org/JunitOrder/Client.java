package org.JunitOrder;


import org.junit.Test;

public class Client {
	
	@Test
	public void tc11() {
		
		System.out.println("1");
	}
	
		@Test
		public  void tc12() {
			org.junit.Assert.assertTrue(false); //  v can use conditon alone here
			System.out.println("11");
			
		}
			@Test
			public void tc13() {
				System.out.println("111");

			}

}
