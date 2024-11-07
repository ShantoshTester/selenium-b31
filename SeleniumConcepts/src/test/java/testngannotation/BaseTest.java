package testngannotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	@BeforeSuite
	public void setUpReport()
	{
		System.out.println("BeforeSuite: Setting up Reporting for Test Case");
	}
	
	@AfterSuite
	public void flushReport()
	{
		System.out.println("AfterSuite : Publish the Execution Report");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest : DB Connection");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest : Close DB Connection");
	}
	
	@BeforeClass
	public void clearCookies()
	{
		System.out.println("BeforeClass : Clear the Cookies after Each Class");
	}
	
	@AfterClass
	public void deleteCookies()
	{
		System.out.println("AfterClass : Delete Cookies");
	}
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("BeforeMethod : Browser Inititated");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("AfterMethod : Browser Quited");
		System.out.println();
	}

}
