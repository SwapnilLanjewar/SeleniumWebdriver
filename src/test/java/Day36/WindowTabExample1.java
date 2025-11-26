package Day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowTabExample1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement link = driver.findElement(By.xpath("//a[normalize-space()='Blogger']"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
		
		List<String> ids = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1));
		
		System.out.println("Testcase passed");
		
		
	}

}
