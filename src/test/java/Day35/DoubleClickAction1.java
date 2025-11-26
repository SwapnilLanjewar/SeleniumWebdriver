package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id=\"field1\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"field1\"]")).sendKeys("Hello");

		
		String field1 = driver.findElement(By.xpath("//input[@id=\"field1\"]")).getText();
	
		
		WebElement button = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction1()\"]"));
		
		Actions act = new Actions(driver);
		act.doubleClick(button).build().perform();
		
		String field2 = driver.findElement(By.xpath("//input[@id=\"field2\"]")).getText();
		
		//Verify
		if(field1.equals(field2)) 
		{
			System.out.println("Test passed");
		}
		else 
		{
			System.out.println("Test failed");
		}
	
	
	
	
	}

}
