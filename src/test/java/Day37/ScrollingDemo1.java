package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/guru99home/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// js.executeScript("window.scrollBy(0,2000)", " ");

		// WebElement title = driver.findElement(By.xpath("//h4[normalize-space()='Video
		// Tutorials']"));
		// js.executeScript("arguments[0].scrollIntoView()", title);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
