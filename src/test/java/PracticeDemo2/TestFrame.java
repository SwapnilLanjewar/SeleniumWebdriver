package PracticeDemo2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFrame {

	WebDriver driver;

	@BeforeTest
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
	}

	@Test
	void test() {
		TestFrameMain tf = new TestFrameMain(driver);
		tf.set_frameonevalue("Samsung");
		System.out.println("Test is passed");
	}

	@AfterTest
	void teardown() {

		driver.quit();

	}
}
