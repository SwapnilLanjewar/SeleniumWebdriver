package Day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*1.launch url
 * 2. test logo presence
 * 3. login
 * 4.close
 */

import org.testng.annotations.Test;

public class TestCaseB {
	WebDriver driver = new ChromeDriver();

	@Test(priority = 1)
	void openapp() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@Test(priority = 2)
	void logo() {
		WebElement title = driver.findElement(By.xpath("//span[normalize-space()='For Selenium, Cypress & Playwright']"));
		System.out.println(title.isDisplayed());
		System.out.println("Logo displayed");
	}

	@Test(priority = 3)
	void login() {
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("John");
	}

	@Test(priority = 4)
	void logout() {
		driver.quit();
		System.out.println("Browser closed successfully");
	}
}
