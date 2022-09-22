package org.JunitOrder;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner2ndMethod {
	
	
	@Test           // to create 1 method and execute the junitcore
	public void methodtosuitelevel() {
		
     Result rs = JUnitCore.runClasses(Employee.class,Client.class);

     int runCount = rs.getRunCount();
  
  
   System.out.println(rs.getIgnoreCount());
   System.out.println(rs.getRunTime());
 
   List<Failure> failures = rs.getFailures();
   
   for (Failure x : failures) {
	   System.out.println(x);
	
}
  
   System.out.println(rs.getRunCount());
  
  
  
	}
	
	
	

}
