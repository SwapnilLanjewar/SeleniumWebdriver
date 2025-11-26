package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Frame_Example_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame1 = driver.findElement(By.xpath("//*[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@name=\"mytext1\"]")).sendKeys("Frame1 inputbox");
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
