package PracticeDemo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleCalendar_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");

		// Switch to iframe
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		// Click on datepicker input
		driver.findElement(By.id("datepicker")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));

		String amonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		String ayear = driver.findElement(By.className("ui-datepicker-year")).getText();

		// Correct loop condition
		while (!(amonth.equals("December") && ayear.equals("2026"))) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();

			amonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			ayear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}

		// Select date
		driver.findElement(By.xpath("//a[normalize-space()='24']")).click();

		// Optional: close browser
		driver.quit();
	}
}