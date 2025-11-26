package Day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Example2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//*[@placeholder=\"Select an item\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),\"Item 35\")]")).click();
		
		
		
	}

}
