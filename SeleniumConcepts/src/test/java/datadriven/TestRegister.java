package datadriven;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestRegister extends TestBase {
	
	@Test(dataProvider = "regdata")
	public void testRegister(String fn, String ln, String ph, String email)
	{
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.name("firstName")).sendKeys(fn);
		driver.findElement(By.name("lastName")).sendKeys(ln);
		driver.findElement(By.name("phone")).sendKeys(ph);
		driver.findElement(By.name("userName")).sendKeys(email);
		
	}

}
