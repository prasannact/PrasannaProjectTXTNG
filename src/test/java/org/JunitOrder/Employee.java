package org.JunitOrder;

import org.junit.Test;

public class Employee {
	
	@Test
	public void tc1() {
		System.out.println("0");

	}
	
	@Test
	public void tc2() {
		System.out.println("00");
	}

		@Test
		public void tc3() {
			org.junit.Assert.assertTrue(false);
			System.out.println("000");
		}

}
