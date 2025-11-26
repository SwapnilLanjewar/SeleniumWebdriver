package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeekDays_Count {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//*[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
		System.out.println("Total weekdays are: "+ checkboxes.size());

		
		for(int i = 0; i<=checkboxes.size()-1 ; i++) 
		{
			checkboxes.get(i).click();
		}
		
		
		//driver.quit();
		
	}

}
