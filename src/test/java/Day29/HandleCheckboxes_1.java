package Day29;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//input[@id='sunday']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='sunday']")).click();

		List<WebElement> weekdays = driver
				.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		System.out.println("Total weekdays: " + weekdays.size());

		
		//Selecting all checkboxes
		for (int i = 0; i < weekdays.size(); i++) {
			weekdays.get(i).click();
		}

	}

}
