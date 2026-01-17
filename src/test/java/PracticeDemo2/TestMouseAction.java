package PracticeDemo2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMouseAction {

	WebDriver driver;

	@BeforeTest
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@Test
	void test() throws InterruptedException {

		TestMouseActionsMain tm = new TestMouseActionsMain(driver);
		tm.hover_pointme();
		System.out.println("Hover is passed");

		tm.click_copybutton();
		String field2 = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']")).getText();
	
		String field1 = driver.findElement(By.xpath("//input[@id='field1']")).getText();

		Thread.sleep(5000);
		Assert.assertEquals(field2, field1);
		System.out.println("Double click test is passed");
	}

	@AfterTest
	void teardown() {
		driver.quit();
	}

}
