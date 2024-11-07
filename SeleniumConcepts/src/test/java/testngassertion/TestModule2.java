package testngassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestModule2 {
	
	@Test
	public void testCase()
	{
		System.out.println("Test Started");
		
		String expected = "Shantosh!";
		
		System.out.println("Step 1 Executed");
		System.out.println("Step 2 Executed");
		System.out.println("Step 3 Executed");
		System.out.println("Step 4 Executed");
		System.out.println("Step 5 Executed");
		
		
		Assert.assertTrue(expected.contains("Welcome"), "Unsuccesful Login");
		
		System.out.println("Step 6 Executed");
		System.out.println("Step 7 Executed");
		System.out.println("Step 8 Executed");
		System.out.println("Step 9 Executed");
		System.out.println("Step 10 Executed");
		
		System.out.println("Test Ended");
	}

}
