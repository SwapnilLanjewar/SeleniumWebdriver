package Day36;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String parentid = driver.getWindowHandle();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		Thread.sleep(5000);
		String title1 = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
		title1.equals("Dashboard");
		System.out.println("Test is passed successfully Logged in");

		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();

		System.out.println("Test is successfully logged out");

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		Set<String> childid = driver.getWindowHandles();

		for (String handle : childid) {
			System.out.println(handle);
			Thread.sleep(5000);

			if (!parentid.equals(handle)) {

				String title2 = driver
						.findElement(By.xpath("//h1[contains(text(),'Streamline All Your HR Needs on One')]"))
						.getText();
				title2.equals("Streamline All Your HR Needs on One");
				System.out.println("Test is passed successfully Navigate to next page");

				driver.quit();

			}
		}

	}

}
