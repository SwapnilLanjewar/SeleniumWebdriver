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

public class DataProviderDemo {
	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "dp")
	void testLogin(String email,String password) {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		boolean status = driver.findElement(By.xpath("//h2[contains(text(),\"My Account\")]")).isDisplayed();

		if (status == true) {
			driver.findElement(By.xpath("//a[@class=\"list-group-item\"][normalize-space()=\"Logout\"]")).click();
			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}
	}

	@AfterClass
	void tearDown() {

	}

	@DataProvider(name = "dp", indices= {1,2})
	Object[][] LoginData() {
		Object data[][] = { { "swapnillanjewar@gmail.com", "swapnil123#" }, { "test@gmail.com", "test@123" },{"testuser@gmail.com","unique@!23"} };

		return data;

	}

}
