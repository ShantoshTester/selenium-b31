package childbrowser;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/windows");
		// getWindowHandle() - this method will get you the address of a parent window
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Thread.sleep(4000);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(4000);
		// getWindowHandles() - this method will get you the address of all the windows opened by the webdriver
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
	}

}
