package Day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertExample2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.hackerearth.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Thread.sleep(5000);

		Alert ma = driver.switchTo().alert();
		ma.accept();

		String Firstresult = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(Firstresult.equals("You successfully clicked an alert"));
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		ma.dismiss();

		String Secondresult = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(Secondresult.equals("You clicked: Cancel"));

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);

		ma.sendKeys("Test");
		ma.accept();
		String Thirdresult = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(Thirdresult.equals("You entered: Test"));

		Thread.sleep(5000);

		driver.quit();
	}

}
