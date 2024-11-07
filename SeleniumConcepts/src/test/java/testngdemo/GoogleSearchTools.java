package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

// ctrl+shift+O = remove unused imports

public class GoogleSearchTools extends BaseScript {
	
	
	@Test(priority = 1)
	public void testSearchSelenium()
	{

		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Page Title : "+title);
  }
	
	@Test(priority = 2)
	public void testSearchAppium()
	{
		driver.findElement(By.name("q")).sendKeys("Appium",Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Page Title : "+title);
  }
	
	@Test(priority = 3)
	public void testSearchCypress()
	{
		driver.findElement(By.name("q")).sendKeys("Cypress",Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Page Title : "+title);
  }
	
	@Test(priority = 4)
	public void testSearchInvalid()
	{
		driver.findElement(By.name("dd")).sendKeys("Cypress",Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Page Title : "+title);
  }

}
