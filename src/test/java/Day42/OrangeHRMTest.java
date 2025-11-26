package Day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/* Launch URL
 * Verify Logo 
 * Login
 * Logout
 */

public class OrangeHRMTest {

	WebDriver driver;

	@Test(priority = 1)
	void LaunchURL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority = 2)
	void Openapplication() {
		Boolean status = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isEnabled();
	}

	@Test(priority = 3)
	void Login() {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Admin123");
	}

	@Test(priority = 4)
	void Logout() {
		driver.quit();
	}
}
