package synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("username")));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'oxd-button oxd-button')]")));
//		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[text()='abc']")));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button')]")).click();

	}

}
