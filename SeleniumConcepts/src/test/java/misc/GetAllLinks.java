package misc;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		System.out.println("Total No of Links Present : "+allLinks.size());
		
		for (WebElement links : allLinks) 
		{
			System.out.println(links.getText());
		}

	}

}
