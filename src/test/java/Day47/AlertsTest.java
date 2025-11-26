package Day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertsTest {

	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Browser launch successfully");
	}

	@Test
	void alerttest() {
		AlertsDemo a = new AlertsDemo(driver);
		a.clicksimplealert();
		a.alertaccept();
		System.out.println("Simple alert passed");

		a.clickconfirmationalert();
		a.alertaccept();
		System.out.println("Confirmation alert passed");

		a.clickpromptalert();
		a.alertaccept();
		System.out.println("Prompt alert passed");

	}

	@AfterClass
	void teardown() {
		driver.quit();
		System.out.println("Browser closed successfully");
	}

}
