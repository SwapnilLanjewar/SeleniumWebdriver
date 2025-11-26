package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement pointme = driver.findElement(By.xpath("//div[@class=\"dropdown\"]"));
		WebElement mobile = driver.findElement(By.xpath("//div[@class=\"dropdown-content\"]//a[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(pointme).moveToElement(mobile).click().build().perform();
		
		
		
	}

}
