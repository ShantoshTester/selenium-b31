package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/User/Desktop/multiselect.html");
		WebElement dropdown = driver.findElement(By.name("multipleselect[]"));
		
		Select sel = new Select(dropdown);
		sel.selectByIndex(0);
		Thread.sleep(3000);
		sel.selectByIndex(1);
		Thread.sleep(3000);
		sel.selectByIndex(2);
		Thread.sleep(3000);
		sel.selectByIndex(3);
		Thread.sleep(3000);
		sel.selectByIndex(4);
		Thread.sleep(3000);
		

		System.out.println("Is this dropdown a multiselect : "+sel.isMultiple());
		
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		List<WebElement> selOptions = sel.getAllSelectedOptions();
		for(WebElement options:selOptions)
		{
			System.out.println(options.getText());
		}
		
		Thread.sleep(5000);
		sel.deselectAll();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
