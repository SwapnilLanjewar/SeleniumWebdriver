package PracticeDemo2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTwo {

	WebDriver driver;

	@BeforeTest
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@Test
	void test() {
		TestTwoMain tm = new TestTwoMain(driver);
		tm.setname("John");
		System.out.println("Name is passed successfully");

		tm.geturl();
		System.out.println("Url is passed successfully");

		tm.gettitle();
		System.out.println("Title is passed successfully");

		tm.checkgenderbutton();
		System.out.println("Gender is passed successfully");

		tm.checkweekbutton();
		System.out.println("Week is passed successfully");
	}

	@AfterTest
	void teardown() {
		driver.quit();
		//driver.close();
	}

}
