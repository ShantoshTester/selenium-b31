package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");

//		WebElement countryDropdown = driver.findElement(By.name("country"));

		Select select = new Select(driver.findElement(By.name("country")));

		Thread.sleep(4000);
		select.selectByValue("GUADELOUPE");

		Thread.sleep(4000);
		driver.quit();
	}

}
