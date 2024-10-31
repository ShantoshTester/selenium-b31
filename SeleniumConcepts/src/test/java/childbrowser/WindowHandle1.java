package childbrowser;

import java.time.Duration;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(4000);
		
		Iterator<String> allWindows = driver.getWindowHandles().iterator();
		String parent = allWindows.next();
		String child = allWindows.next();
		
		Thread.sleep(4000);
		driver.switchTo().window(child);
		System.out.println("Child Window Title "+driver.getTitle());
		String text = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(text);
		driver.close();
		
		driver.switchTo().window(parent);
		System.out.println("Parent Window Title "+driver.getTitle());
		String parentText = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(parentText);
		Thread.sleep(4000);
		driver.close();
		

	}

}
