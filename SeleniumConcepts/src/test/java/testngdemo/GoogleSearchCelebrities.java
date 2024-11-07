package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchCelebrities extends BaseScript {
	
	
	@Test
	public void testSearchHritik()
	{
		driver.findElement(By.name("q")).sendKeys("Hritik Roshan",Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Page Title : "+title);
  }
	
	@Test
	public void testSearchRajini() 
	{
		driver.findElement(By.name("q")).sendKeys("Rajini",Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Page Title : "+title);
    }
	
	@Test
	public void testSearchKate() 
	{
		driver.findElement(By.name("q")).sendKeys("Kate Winslet",Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Page Title : "+title);
  }

}
