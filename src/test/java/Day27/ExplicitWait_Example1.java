package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Example1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement userid = mywait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));

		userid.sendKeys("Admin");

		WebElement userpassword = mywait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));

		userpassword.sendKeys("admin123");

		WebElement loginbutton = mywait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));

		loginbutton.click();

	}

}
