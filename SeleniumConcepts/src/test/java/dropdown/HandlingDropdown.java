package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		// identify the drop down element
		WebElement countryDropdown = driver.findElement(By.name("country"));
		// create an object of select class and pass this drop down web element as a parameter
		Select select = new Select(countryDropdown);
		// there are 3 different ways to select an option from a drop down
		// 1 using index
		select.selectByIndex(10);
		Thread.sleep(4000);
		
		// 2 using visible text
		select.selectByVisibleText("INDONESIA");
		Thread.sleep(4000);
		
		// 3 using value
		select.selectByValue("GUADELOUPE");
	}

}
