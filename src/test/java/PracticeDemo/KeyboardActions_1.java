package PracticeDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions_1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("John");

		Actions act = new Actions(driver);

		act.keyDown(Keys.CONTROL).sendKeys("A").keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL)
				.keyUp(Keys.CONTROL).perform();

		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.TAB).perform();

	}

}
