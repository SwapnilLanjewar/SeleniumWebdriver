package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts1 {

	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//Normal Alert with OK button
		driver.findElement(By.xpath("//button[@onclick=\"myFunctionAlert()\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		System.out.println("Normal Alert is closed");
		
		
		Thread.sleep(5000);
		//Confirmation Alert
		driver.findElement(By.xpath("//button[@onclick=\"myFunctionConfirm()\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("Confirmation Alert is closed");
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick=\"myFunctionConfirm()\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("Confirmation Alert is cancelled");
		
		
		Thread.sleep(5000);
		//Prompt Alert
		driver.findElement(By.xpath("//button[@onclick=\"myFunctionPrompt()\"]")).click();
		Thread.sleep(2000);
		String text = driver.switchTo().alert().getText();
		System.out.println("The text present is:"+ text);
		Thread.sleep(5000);

		driver.switchTo().alert().sendKeys("Latest popup");
		driver.switchTo().alert().accept();
		
		
		
	}

}
