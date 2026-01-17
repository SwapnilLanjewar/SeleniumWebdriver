package PracticeDemo2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOne {

	WebDriver driver;

	@BeforeTest
	void setup() {
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	void test() {
		TestOneMain tc = new TestOneMain(driver);
		tc.set_name("Peter");
		tc.set_email("peter@gmail.com");
		tc.set_phone("9900889900");
		tc.set_address("Street ABC London");
		tc.set_gender();
		tc.set_week();
		System.out.println("Current url is:" + tc.get_currenturl());
		System.out.println("Title is:" + tc.get_title());
		System.out.println("PageTitle is present:" + tc.get_pagetitle());

	}

	@AfterTest
	void teardown() {
		driver.quit();
	}
}
