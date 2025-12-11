package PracticeDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAlerts_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.hackerearth.com/javascript_alerts");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Alert altdriver = driver.switchTo().alert();
		altdriver.accept();
		String result1 = driver.findElement(By.xpath("//p[@id='result']")).getText();
		result1.equals("You successfully clicked an alert");
		System.out.println("Frist alert passed");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		altdriver.dismiss();
		String result2 = driver.findElement(By.xpath("//p[@id='result']")).getText();
		result2.equals("You clicked: Cancel");
		System.out.println("Second alert passed");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		altdriver.sendKeys("Test passed");
		Thread.sleep(2000);
		altdriver.accept();
		String result3 = driver.findElement(By.xpath("//p[@id='result']")).getText();
		result3.equals("You clicked: Test passed");
		System.out.println("Third alert passed");

	}

}
