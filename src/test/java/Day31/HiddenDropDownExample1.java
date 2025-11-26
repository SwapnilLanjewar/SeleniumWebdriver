package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDownExample1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practice.expandtesting.com/dropdown");

		driver.findElement(By.xpath("//select[@id='country']")).click();
		List<WebElement> countryoptions = driver.findElements(By.xpath("//select[@id='country']"));

		for (WebElement op : countryoptions) {
			System.out.println(op.getText());
		}

	}

}
