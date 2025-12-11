package PracticeDemo;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage_1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		/*
		 * js.executeScript("window.scrollBy(0,5000)", " ");
		 */

		/*
		 * WebElement table =
		 * driver.findElement(By.xpath("//h2[normalize-space()='Dynamic Web Table']"));
		 * js.executeScript("arguments[0].scrollIntoView();", table);
		 */

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
