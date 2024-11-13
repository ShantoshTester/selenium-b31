package datadriven;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	
	@DataProvider(name="wsdata")
	public Object[][] testData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "selauto1@test.com";
		data[0][1] = "Pass@123";
		
		data[1][0] = "selauto2@test.com";
		data[1][1] = "Password@123";
		
		return data;
	}
	
	@Test(dataProvider = "wsdata")
	public void testLoginFunction(String username, String password) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement logoutLink = driver.findElement(By.linkText("Log out"));
		String logout = logoutLink.getText();
		Assert.assertTrue(logout.contains("out"));
		logoutLink.click();
		Thread.sleep(4000);
		driver.quit();
		
	}

}
