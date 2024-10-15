package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitleTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		String pageTitle = driver.getTitle();
		System.out.println("Home Page Title : "+pageTitle);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
