package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames_Demo {

	public static void main(String[] args) {



		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frameone = driver.findElement(By.xpath("//*[@src=\"frame_1.html\"]"));
		WebElement frametwo = driver.findElement(By.xpath("//*[@src=\"frame_2.html\"]"));
		WebElement framethree = driver.findElement(By.xpath("//*[@src=\"frame_3.html\"]"));
		WebElement framefour = driver.findElement(By.xpath("//*[@src=\"frame_4.html\"]"));
		WebElement framefive = driver.findElement(By.xpath("//*[@src=\"frame_5.html\"]"));
		
		driver.switchTo().frame(frameone);
		driver.findElement(By.xpath("//*[@name=\"mytext1\"]")).sendKeys("Samsung");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(frametwo);
		driver.findElement(By.xpath("//*[@name=\"mytext2\"]")).sendKeys("Motorola");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(framethree);
		driver.findElement(By.xpath("//*[@name=\"mytext3\"]")).sendKeys("Nokia");		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(framefour);
		driver.findElement(By.xpath("//*[@name=\"mytext4\"]")).sendKeys("Apple");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(framefive);
		driver.findElement(By.xpath("//*[@name=\"mytext5\"]")).sendKeys("Realme");
		driver.switchTo().defaultContent();
	}

}
