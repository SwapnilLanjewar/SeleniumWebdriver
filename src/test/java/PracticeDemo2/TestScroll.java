package PracticeDemo2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScroll {

	WebDriver driver;

	@BeforeTest
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.countries-ofthe-world.com/world-currencies.html");
	}

	@Test
	void test() throws InterruptedException {
		TestScrollingMain js = new TestScrollingMain(driver);
		js.scrollmethod();
	}

	@AfterTest
	void teardown() {
		driver.quit();
	}

}
