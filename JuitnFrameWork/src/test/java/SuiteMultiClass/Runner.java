package SuiteMultiClass;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({ClassOne.class,ClassTwo.class,ClassThree.class})
public class Runner {
	
	@Test
	public void result() {
	Result r = JUnitCore.runClasses(ClassOne.class,ClassTwo.class,ClassThree.class);
	System.out.println("Run Count : " + r.getRunCount());
	System.out.println("Run Count : " + r.getFailureCount());
	System.out.println("Run Count : " + r.getRunTime());
	System.out.println("Run Count : " + r.getIgnoreCount());
	List<Failure> failures = r.getFailures();
	System.out.println("Failes " + failures);
	}
}
