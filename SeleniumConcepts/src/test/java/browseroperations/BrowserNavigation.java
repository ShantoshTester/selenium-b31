package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		Thread.sleep(4000);
		System.out.println("page title : "+driver.getTitle());
		driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
		Thread.sleep(4000);
		System.out.println("page title : "+driver.getTitle());
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.quit();
	}

}
