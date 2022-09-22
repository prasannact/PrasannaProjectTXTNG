package org.JunitOrder;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


//  Before v should initialize this to run , 2 or more class in single run

@RunWith(Suite.class)
@SuiteClasses({Employee.class,Client.class})

public class RunnerClass_SuiteLevel {
	
	
	

}
