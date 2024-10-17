package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoToursRegister {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("jhon");
		driver.findElement(By.name("lastName")).sendKeys("Smith");
		driver.findElement(By.name("phone")).sendKeys("510-456-7910");
		driver.findElement(By.id("userName")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("address1")).sendKeys("510 Shuttock St");
		driver.findElement(By.name("city")).sendKeys("Berkely");
		driver.findElement(By.name("state")).sendKeys("California");
		driver.findElement(By.name("postalCode")).sendKeys("90625");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("California");
		driver.findElement(By.name("confirmPassword")).sendKeys("California");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
