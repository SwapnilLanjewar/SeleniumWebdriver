package PracticeDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropdown_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to Flipkart
		driver.get("https://www.flipkart.com/");

		// Close login popup if it appears
		try {
			driver.findElement(By.xpath("//span[text()='✕']")).click();
		} catch (Exception e) {
			System.out.println("No login popup appeared.");
		}

		// Locate search box and type "Mobile"
		WebElement searchBox = driver
				.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		searchBox.sendKeys("Mobile");

		Thread.sleep(3000); // wait for auto-suggestions to load

		// Capture auto-suggestions
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[contains(@class,'_1sFryS')]/li"));

		System.out.println("Suggestions count: " + suggestions.size());

		// Click the first suggestion if available
		if (!suggestions.isEmpty()) {
			suggestions.get(0).click();
		} else {
			System.out.println("No suggestions found.");
		}

		// Optional: wait and close browser
		Thread.sleep(5000);
		driver.quit();
	}
}