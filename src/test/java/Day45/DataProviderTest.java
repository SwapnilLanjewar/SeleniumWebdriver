package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "dp")
	void login(String email, String password) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		boolean title = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();

		if (title == true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}
	}

	@AfterClass
	void tearDown() {

		driver.close();

	}

	@DataProvider(name = "dp", indices = { 1, 4 })
	Object[][] loginDatanew() {
		Object data[][] = { { "abc@gmail.com", "test@123" }, { "tgh@gmail.com", "usis123" },
				{ "top@gmail.com", "top@123" }, { "you@tp.com", "ion123" }, { "test007@test.com", "test123" } };

		return data;
	}
}
