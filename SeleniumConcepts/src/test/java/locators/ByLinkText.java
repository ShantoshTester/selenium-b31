package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/sample.html");
		
		driver.findElement(By.linkText("Google")).click();
		
		System.out.println("Navigated Page Title "+driver.getTitle());
		Thread.sleep(4000);
		driver.quit();

	}

}
