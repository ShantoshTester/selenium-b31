package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url : "+currentUrl);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
