package datadriven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ExcelUtil;

public class TestBase {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
	
	@DataProvider(name="regdata")
	public Object[][] testData1()
	{
		ExcelUtil excel = new ExcelUtil("./src/test/resources/data/wsdata.xlsx");
		int row = excel.getRowCount("register");
		
		Object[][] data = new Object[row][4];
		
		for(int i=0; i<row; i++)
		{
			data[i][0] = excel.getCellData("register", i, 0);
			data[i][1] = excel.getCellData("register", i, 1);
			data[i][2] = excel.getCellData("register", i, 2);
			data[i][3] = excel.getCellData("register", i, 3);
		}
		
		return data;
	}
	
	@DataProvider(name="wsdata")
	public Object[][] testData()
	{
		ExcelUtil excel = new ExcelUtil("./src/test/resources/data/wsdata.xlsx");
		int row = excel.getRowCount(0);
		
		Object[][] data = new Object[row][2];
		
		for(int i=0; i<row; i++)
		{
			data[i][0] = excel.getCellData(0, i, 0);
			data[i][1] = excel.getCellData(0, i, 1);
		}
		
		return data;
	}

}
