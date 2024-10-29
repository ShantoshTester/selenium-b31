package filehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/download");
		Thread.sleep(5000);
		driver.findElement(By.linkText("selenide-intro.txt")).click();
		Thread.sleep(5000);
		System.out.println("File downloaded successfull");
		Thread.sleep(5000);
		driver.quit();
	}

}
