package jptestpkg;

import org.testng.annotations.Test;

public class SampleTest2

{

	@Test(groups= {"RegressionTest"})
	public void method2()
	{
		System.out.println("Method2 is running");
	}

}
