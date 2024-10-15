package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/sample.html");
		WebElement element = driver.findElement(By.tagName("a"));
		element.click();
		System.out.println("page title : "+driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}

}