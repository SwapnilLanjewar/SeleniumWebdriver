package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitDemo_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
		mywait.until(ExpectedConditions.visibilityOf(title));
		
		
	}

}
