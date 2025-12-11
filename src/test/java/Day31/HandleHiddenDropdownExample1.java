package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropdownExample1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("Iphone");

		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]"));
		System.out.println(suggestions.size());

		if (!suggestions.isEmpty()) {
			suggestions.get(0).click();
		} else {
			System.out.println("Suggestions not found");

		}

	}

}
