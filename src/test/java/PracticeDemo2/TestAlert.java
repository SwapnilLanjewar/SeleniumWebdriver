package PracticeDemo2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAlert {

	WebDriver driver;

	@BeforeTest
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
	}

	@Test
	void test() throws InterruptedException {
		TestAlertMain ta = new TestAlertMain(driver);
		ta.click_simplealert();
		System.out.println("Simple alert is accepted");

		ta.click_confirmalert();
		System.out.println("Confirm alert is dismissed");

		ta.click_promptalert();
		System.out.println("prompt alert is accepted");
	}

	@AfterTest
	void teardown() {
		driver.quit();
	}
}
