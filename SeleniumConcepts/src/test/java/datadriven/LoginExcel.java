package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginExcel extends TestBase {
	

	
	@Test(dataProvider = "wsdata")
	public void testLoginFunction(String username, String password)
	{
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement logoutLink = driver.findElement(By.linkText("Log out"));
		String expected = "Log out";
//		String logout = logoutLink.getText();
//		Assert.assertTrue(logout.contains("out"));
		String actual = logoutLink.getText();
		Assert.assertEquals(actual, expected,"unsuccesful login");
		logoutLink.click();
	}

}
