package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_Example2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		Actions ac = new Actions(driver);

		WebElement pointme = driver.findElement(By.xpath("//div[@class='dropdown']"));

		ac.moveToElement(pointme).build().perform();

		WebElement sourceelement = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement targetelement = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));

		ac.dragAndDrop(sourceelement, targetelement).build().perform();

		WebElement field1 = driver.findElement(By.xpath("//*[@id=\"field1\"]"));

		driver.findElement(By.xpath("//*[@id=\"field2\"]")).sendKeys("Hello World!");

		WebElement copytext = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

		ac.contextClick(copytext).build().perform();

		WebElement field2 = driver.findElement(By.xpath("//*[@id=\"field2\"]"));

		Thread.sleep(5000);
		
		if (field1 == field2) {
			System.out.println("Testcase passed");
		}

	}

}
