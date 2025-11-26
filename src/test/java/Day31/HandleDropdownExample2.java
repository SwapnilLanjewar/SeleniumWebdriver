package Day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownExample2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement drpCountryElement = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpCountry = new Select(drpCountryElement);
		drpCountry.selectByValue("india");
		
		System.out.println("Testcase passed");
		
		
		
	}

}
