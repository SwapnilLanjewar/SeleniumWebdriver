package PracticeDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPage {

	WebDriver driver;

	@BeforeClass
	void setup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");

	}

	@Test
	void test() {

		TestMainPage ts = new TestMainPage(driver);
		ts.setname("John");
		ts.setemail("john@gmail.com");
		ts.setphone("9988776655");
		ts.setaddress("XYZ Street");

		Assert.assertEquals(driver.getTitle(), "Automation Testing Practice");
		System.out.println("Test is passed");

	}

	@AfterClass
	void teardown() {

		driver.quit();

	}

}
