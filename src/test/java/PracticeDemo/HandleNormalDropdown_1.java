package PracticeDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleNormalDropdown_1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		// WebElement countrydropdown =
		// driver.findElement(By.xpath("//select[@id='country']"));

		// Select country = new Select(countrydropdown);

		Select countrydropdown = new Select(driver.findElement(By.id("country")));

		List<WebElement> countryoptions = countrydropdown.getOptions();

		System.out.println(countryoptions.size());

		// country.selectByValue("india");

		// country.selectByIndex(4);

		// country.selectByVisibleText("india");
		// System.out.println("Testcase is passed");

	}

}
