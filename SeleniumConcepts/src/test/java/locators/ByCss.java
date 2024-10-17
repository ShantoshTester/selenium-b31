package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCss {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/csssample.html");
		driver.findElement(By.tagName("input")).sendKeys("john@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");

	}

}
