package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownExample2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement drpcountryele = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		
		Select drpcountry = new Select(drpcountryele);
		
		//drpcountry.selectByIndex(1);
		drpcountry.selectByValue("uk");
		
		Thread.sleep(5000);
		List<WebElement> options = drpcountry.getOptions();
		System.out.println("Number of options are "+ options.size());
		
		driver.quit();
	}

}
