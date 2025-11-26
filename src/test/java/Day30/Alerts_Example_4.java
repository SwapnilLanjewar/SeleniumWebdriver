package Day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Example_4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Alert myalert = driver.switchTo().alert();

		//Thread.sleep(5000);
		//Simple Alert
		driver.findElement(By.xpath("//*[@id=\"alertBtn\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id=\"confirmBtn\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
	}

}
