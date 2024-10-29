package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Your Orders']")).click();

	}

}
