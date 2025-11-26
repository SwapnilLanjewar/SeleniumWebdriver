package Day35;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Example1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		
		
		Actions act = new Actions(driver);
		
		act.doubleClick(button).perform();

		
		Alert a = driver.switchTo().alert();
		
		a.accept();
		
		System.out.println("Testcase passed");
		
		driver.quit();
		
	}

}
