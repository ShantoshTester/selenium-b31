package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String pageSource = driver.getPageSource();
		System.out.println("page source :/"+pageSource);
		
		Thread.sleep(4000);
		driver.quit();

	}

}
