package childbrowser;

import java.time.Duration;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/windows");
		
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(4000);
		
		Iterator<String> allWin = driver.getWindowHandles().iterator();
		
		while(allWin.hasNext())
		{
			driver.switchTo().window(allWin.next());
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.equals("New Window"))
			{
				String text = driver.findElement(By.xpath("//h3")).getText();
				System.out.println(text);
				driver.close();
			}
		}
		
		Thread.sleep(4000);
		driver.switchTo().window(parent);
		String text = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(text);
		driver.quit();
		
		
		

	}

}
