package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitCommandDemo3 {

	public static void main(String[] args) {

		WebDriver driver  = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebDriverWait mywait  = new WebDriverWait(driver,Duration.ofSeconds(10));
		
     	WebElement title = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"title\"]")));
     	
     	System.out.println("The element is displayed");
     	
     	driver.quit();
     	
     	
	}

}
