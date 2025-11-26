package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_Example1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement targetelement = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(source, targetelement).perform();
		
		System.out.println("Testcase passed sucessfully");

		driver.quit();

	}

}
