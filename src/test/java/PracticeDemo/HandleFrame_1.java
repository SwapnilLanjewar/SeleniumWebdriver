package PracticeDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");

		WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));

		driver.switchTo().frame(frame1);

		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Apple");
		System.out.println("Frame 1 passed");

		driver.switchTo().defaultContent();

		driver.switchTo().frame(frame2);

		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Samsung");
		System.out.println("Frame 2 passed");
		
		driver.quit();

	}

}
