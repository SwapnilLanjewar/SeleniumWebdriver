package Day26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllGetCommands {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getWindowHandle());

		System.out.println(driver.getPageSource());

		driver.findElement(By.xpath("//*[text()=\"OrangeHRM, Inc\"]")).click();

		Thread.sleep(5000);

		Set<String> Windowids = driver.getWindowHandles();

		System.out.println(Windowids);

		driver.quit();

	}

}
