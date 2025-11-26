package Day45;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser", "url" })
	void setup(String br, String url) throws InterruptedException {
		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser");
			return;
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	void testlogo() throws InterruptedException {
		boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logo, true);
		System.out.println("Logo is passed");

	}

	@Test(priority = 2)
	void testtitle() {
		String title = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		System.out.println("Title is passed");
	}

	@Test(priority = 3)
	void testurl() {

		String url = driver.getCurrentUrl();
		assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Url is passed");

	}

	@AfterClass
	void teardown() {

		driver.quit();
	}

}
