package browsertest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(4000);
		driver.quit();

	}

}
