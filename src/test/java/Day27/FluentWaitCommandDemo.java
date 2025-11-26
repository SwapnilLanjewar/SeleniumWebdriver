package Day27;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitCommandDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10)) // Set the timeout duration
				.pollingEvery(Duration.ofSeconds(2)) // Set the polling interval
				.ignoring(NoSuchElementException.class); // Ignore specific exceptions

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("placeholder=\"Username\"")).sendKeys("Admin");

		
		
		
	}

}
