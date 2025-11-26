package Day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Example_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.hackerearth.com/javascript_alerts");

		// NORMAL ALERT
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

		Thread.sleep(5000);
		
		Alert myalert = driver.switchTo().alert();

		Thread.sleep(5000);

		driver.quit();
	}

}
