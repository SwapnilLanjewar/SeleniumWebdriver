package PracticeDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Actions act = new Actions(driver);
		
		WebElement pointme = driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
		act.moveToElement(pointme).build().perform();
		Thread.sleep(5000);
		
		WebElement copytext = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		act.contextClick(copytext).build().perform();
		
		WebElement sourceelement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement targetelement = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(sourceelement, targetelement).build().perform();
	
		
		
		
	}

}
