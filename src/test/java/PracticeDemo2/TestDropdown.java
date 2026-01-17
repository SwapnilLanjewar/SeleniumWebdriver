package PracticeDemo2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDropdown {

	WebDriver driver;

	@BeforeTest
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");

	}

	@Test
	void test() throws InterruptedException {
		TestDropdownMain dp = new TestDropdownMain(driver);
		//dp.select_countryname();
		//System.out.println("Test is passed");
		//Thread.sleep(5000);
		
		//dp.set_wikisearch("Iphone");
		//dp.search_wiki();
		
		dp.set_googlesearch("Iphone");
		dp.select_dropdownelement();

	}

	@AfterTest
	void teardown() {
		//driver.quit();
	}

}
