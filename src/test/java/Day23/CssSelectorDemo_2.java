package Day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo_2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("input#name")).sendKeys("John");
		
		driver.findElement(By.cssSelector(".wikipedia-search-input")).sendKeys("Selenium");
		
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("XYZ street,USA");

		driver.findElement(By.cssSelector("input[id=\"male\"]")).click();
		
		driver.findElement(By.cssSelector("input.form-control[id=\"email\"]")).sendKeys("john@abc.com");
		
	}

}
