package browsertest;

import org.openqa.selenium.edge.EdgeDriver;

public class TestEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		driver.quit();

	}

}
