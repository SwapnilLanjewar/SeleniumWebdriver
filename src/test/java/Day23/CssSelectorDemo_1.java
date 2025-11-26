package Day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo_1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.cssSelector("input#name")).sendKeys("Test user");

		driver.findElement(By.cssSelector(".wikipedia-search-input")).sendKeys("Selenium");

		driver.findElement(By.cssSelector("button[onclick=\"toggleButton(this)\"]")).click();

		driver.findElement(By.cssSelector("input[value=\"sunday\"]")).click();

		boolean titlestatus = driver.findElement(By.xpath("//h1[@class=\"title\"]")).isDisplayed();
		System.out.println(titlestatus);
		System.out.println("Testcase passed");
		
		driver.quit();
	}

}
