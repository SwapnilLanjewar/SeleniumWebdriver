package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Actions act= new Actions(driver);
		WebElement sourceelement = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement targetelement = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		act.dragAndDrop(sourceelement, targetelement).build().perform();
		
			System.out.println("Testcase passed");
		}

}
