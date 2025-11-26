package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_Example1 {

	public static void main(String[] args) {

		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement pointme = driver.findElement(By.xpath("//button[normalize-space()='Point Me']")); 
		
		WebElement mobileoption = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));

		Actions act = new Actions(driver);
		
		act.moveToElement(pointme).moveToElement(mobileoption).click().build().perform();
		
		
		
	}

}
