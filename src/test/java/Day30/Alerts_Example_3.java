package Day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Example_3 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.hackerearth.com/javascript_alerts");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		
		//JS prompt alert
		Alert alt= driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		alt.sendKeys("Alert testing");
		
		alt.accept();
		
		driver.quit();
	

	}

}
