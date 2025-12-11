package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdownHandle_3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");

		WebElement search = driver.findElement(By.xpath("//*[@title=\"Search\"]"));
		search.sendKeys("Mobile");

		List<WebElement> suggestions = driver
				.findElements(By.xpath("//div[@role=\"presentation\"]//ul[contains(.,'mobile')]"));

		for (WebElement op : suggestions) {
			System.out.println(op.getSize());

			if (!suggestions.isEmpty()) {
				suggestions.get(0).click();
			} else {
				System.out.println("Element not found");
			}
		}

	}

}
