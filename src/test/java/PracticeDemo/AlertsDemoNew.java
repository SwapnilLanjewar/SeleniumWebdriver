package PracticeDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemoNew {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();

		Alert myalert = driver.switchTo().alert();
		Thread.sleep(5000);
		myalert.accept();
		System.out.println("Normal alert passed");

		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Thread.sleep(5000);
		myalert.dismiss();
		System.out.println("Confirmation alert passed");

		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		System.out.println(myalert.getText());
		Thread.sleep(5000);
		myalert.accept();
		System.out.println("Prompt alert passed");

	}

}
