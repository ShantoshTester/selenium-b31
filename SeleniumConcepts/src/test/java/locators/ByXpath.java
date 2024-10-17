package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.xpath("//textarea[@name='q']"));
		element.sendKeys("kate winslet");
		
		Thread.sleep(3000);
		driver.quit();

	}

}
