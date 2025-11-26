package Day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("name")).sendKeys("Peter");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("peter@xyz.com");
		
		WebElement phoneno = driver.findElement(By.xpath("//input[@id='phone']"));
		phoneno.sendKeys("9988776655");

		/*
		driver.findElement(By.linkText("Apple")).click();
		String appleurl = driver.getCurrentUrl();
		appleurl.equals("https://www.apple.com/");
		*/
		
		/*
		driver.findElement(By.partialLinkText("Leno")).click();
		driver.navigate().back();
		*/
		
	
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		
		System.out.println("Testcase is passed");

		
		driver.quit();
	}

}
