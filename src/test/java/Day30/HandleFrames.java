package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://ui.vision/demo/webtest/frames/");

		//Frame 1
		WebElement frame1 = driver.findElement(By.xpath("//*[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@name=\"mytext1\"]")).sendKeys("Apple");

		driver.switchTo().defaultContent();  //We need to navigate to default frame before travelling to another frame

		//Frame 2
		WebElement frame2 = driver.findElement(By.xpath("//*[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[@name=\"mytext2\"]")).sendKeys("Samsung");

		driver.switchTo().defaultContent();

		//Frame 3
		WebElement frame3 = driver.findElement(By.xpath("//*[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//*[@name=\"mytext3\"]")).sendKeys("Motorola");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@aria-label=\"I am a human\"]")).click();
		driver.findElement(By.xpath("//*[@data-answer-value=\"Web Testing\"]")).click();

		driver.switchTo().defaultContent();
		
		//Frame 4
		WebElement frame4 = driver.findElement(By.xpath("//*[@src=\"frame_4.html\"]"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//*[@name=\"mytext4\"]")).sendKeys("Oneplus");
		
		driver.switchTo().defaultContent();

		//Frame 5
		WebElement frame5 = driver.findElement(By.xpath("//*[@src=\"frame_5.html\"]"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//*[@name=\"mytext5\"]")).sendKeys("Realme");
	
		
		

	}

}
