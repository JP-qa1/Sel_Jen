package jptestpkg;

import org.testng.annotations.Test;

public class SampleTest3 
{
	@Test(groups= {"SmokeTest","RegressionTest"})
	public void method3()
	{
		System.out.println("Method3 is running");
		System.out.println("Push Test 1st Commit");
	}
}
