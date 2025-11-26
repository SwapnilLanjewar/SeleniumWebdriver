package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesExample_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@class=\"form-check-input\" and @type=\"checkbox\"]"));

		System.out.println("Number of checkboxes: " + checkboxes.size());

		// Selecting multiple options
		for (int i = 0; i < checkboxes.size(); i++) 
		{
			checkboxes.get(i).click();
		}
		
		
		Thread.sleep(5000);
		
		//Unselect checkboxes
		for(WebElement chkbox : checkboxes) 
		{
			chkbox.click();
		}
		
		
		driver.quit();
		
		
	}

}
