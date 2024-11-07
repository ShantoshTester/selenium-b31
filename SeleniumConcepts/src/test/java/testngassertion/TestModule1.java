package testngassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestModule1 {
	
	@Test
	public void testCase()
	{
		System.out.println("Test Started");
		
		String expected = "LoginPage";
		System.out.println("Step 1 Executed");
		System.out.println("Step 2 Executed");
		System.out.println("Step 3 Executed");
		System.out.println("Step 4 Executed");
		System.out.println("Step 5 Executed");
		String actual = "HomePage";
		
		Assert.assertEquals(actual, expected,"Unsuccessful Login");
		
		System.out.println("Step 6 Executed");
		System.out.println("Step 7 Executed");
		System.out.println("Step 8 Executed");
		System.out.println("Step 9 Executed");
		System.out.println("Step 10 Executed");
		
		System.out.println("Test Ended");
	}

}
