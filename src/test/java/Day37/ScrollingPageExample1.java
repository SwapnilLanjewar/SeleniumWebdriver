package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageExample1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		/* Scroll till mentioned pixel
		js.executeScript("window.scrollBy(0,2000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		*/
		
		// Scroll till element is visible
		WebElement mobile = driver.findElement(By.xpath("//h4[normalize-space()='Mobile Labels']"));
		js.executeScript("arguments[0].scrollIntoView();", mobile);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		js.executeScript("document.body.style.zoom='50%'");
		
	}

}
