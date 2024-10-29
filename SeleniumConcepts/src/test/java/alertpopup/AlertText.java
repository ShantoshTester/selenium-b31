package alertpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("Hello World");
		Thread.sleep(4000);
		String text = driver.switchTo().alert().getText();
		System.out.println("Text Present in the Alert "+text);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.quit();

	}

}
