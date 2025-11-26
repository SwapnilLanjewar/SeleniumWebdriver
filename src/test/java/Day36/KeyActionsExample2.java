package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyActionsExample2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("John");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter EMail']")).sendKeys("john@test.com");
		
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		

		
	}

}
