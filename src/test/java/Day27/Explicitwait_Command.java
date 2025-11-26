package Day27;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_Command {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		Boolean titlestatus  = mywait.until(ExpectedConditions.titleContains("Automation Testing Practice"));
		
		titlestatus.equals(title);
		
		System.out.println("Status is match: "+ titlestatus);
		
		System.out.println("Testcases passed");
		
		driver.quit();
		
	}

}
