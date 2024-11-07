package testngannotation;

import org.testng.annotations.Test;

public class TestCase1 extends BaseTest {
	

	@Test(invocationCount = 5)
	public void testCaseOne()
	{
		System.out.println("Test Case One Executed");
	}
	
	@Test(enabled = false)
	public void testCaseTwo()
	{
		System.out.println("Test Case Two Executed");
	}

}
