package radiobutton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreate {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Adam");
		driver.findElement(By.name("lastname")).sendKeys("Smith");
		
		WebElement day = driver.findElement(By.id("day"));
//		Select select = new Select(day);
//		select.selectByIndex(4);
		new Select(day).selectByIndex(4);
		
		WebElement month = driver.findElement(By.id("month"));
		new Select(month).selectByIndex(6);
		
		WebElement year = driver.findElement(By.id("year"));
		new Select(year).selectByVisibleText("1984");
		
		driver.findElement(By.xpath("//input[@id='sex' and @value='2']")).click();

	}

}
