package Day38;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTestingDemo1 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//button[@onclick=\"myFunctionAlert()\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		System.out.println("Normal Alert is closed");

		Thread.sleep(5000);
		// Confirmation Alert
		driver.findElement(By.xpath("//button[@onclick=\"myFunctionConfirm()\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("Confirmation Alert is closed");

	}

}
