package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeAsWebelement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");
		
		WebElement element = 
				driver.findElement(By.xpath("(//iframe[contains(@src,'https://seleniumautomationpractice')])[1]"));
		
		driver.switchTo().frame(element);
		
		driver.findElement(By.xpath("//input[@id='ts_first_name']")).sendKeys("Daniel");
		
		Thread.sleep(4000);
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("(//span[@class='profile-name' and text()='abhresh'])[1]")).click();

	}

}
