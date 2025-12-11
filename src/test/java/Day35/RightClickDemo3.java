package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement rightbutton = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		WebElement doubleclickbutton = driver
				.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));

		Actions act = new Actions(driver);

		act.contextClick(rightbutton).build().perform();
		
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-quit']")).click();
		
		Thread.sleep(60000);
		act.doubleClick(doubleclickbutton).perform();
		

	}

}
