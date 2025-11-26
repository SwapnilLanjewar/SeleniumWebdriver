package Day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertusingExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
		myalert.accept();
	}

}
