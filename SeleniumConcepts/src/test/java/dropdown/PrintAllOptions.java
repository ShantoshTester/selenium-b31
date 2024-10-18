package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {

	public static void main(String[] args) throws InterruptedException {

		// First get the total number of options present in the dropdown
		// Print all the values present in the dropdown

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));

		Select select = new Select(dropdown);
		boolean flag = select.isMultiple();
		System.out.println("Is this dropdown a multiselect : " + flag);

		List<WebElement> allOptions = select.getOptions();
		System.out.println("Total no of Options present in this dropdown : " + allOptions.size());
		
		for (WebElement options : allOptions) {
			System.out.println(options.getText());
		}
		
		Thread.sleep(5000);
		System.out.println();
		System.out.println("************* Printing the value in Reverse Order ********************");

		
	    for (int i = allOptions.size()-1; i >=0; i--) 
		{
			System.out.println(allOptions.get(i).getText());
		}
	

		Thread.sleep(5000);
		driver.quit();

	}

}
