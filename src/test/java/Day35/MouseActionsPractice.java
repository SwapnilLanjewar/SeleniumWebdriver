package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsPractice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/#");
		
		WebElement pointme = driver.findElement(By.xpath("//button[contains(text(),\"Point Me\")]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(pointme).build().perform();
		
		driver.findElement(By.xpath("//a[contains(text(),\"Mobiles\")]")).click();
		
		
		
		String content = driver.findElement(By.xpath("//div[@class=\"dropdown-content\"]")).getText();
		
		System.out.println(content);
	
	}

}
