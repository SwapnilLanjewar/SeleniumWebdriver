package PracticeDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC1 {
	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@Test
	void test() {
		TestAutomationPageclass ta = new TestAutomationPageclass(driver);
		
		ta.verify_title();
		System.out.println("Title is passed");
		ta.set_name();
		ta.wikipedia_window();
		

	}
	
	@AfterClass
	void teardown() 
	{
		System.out.println("Test is passed successfully");
		//driver.quit();
	}
}
