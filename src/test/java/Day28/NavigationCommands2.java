package Day28;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//a[normalize-space()='Udemy Courses']")).click();

		Thread.sleep(5000);

		// Verify title
		WebElement title1 = driver.findElement(By.xpath("//a[normalize-space()='SDET-QA']"));
		title1.equals("SDET-QA");

		System.out.println("Title1 is matched");

		driver.navigate().back();

		Thread.sleep(5000);
		WebElement title2 = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
		title2.equals("Automation Testing Practice");

		System.out.println("Title2 is matched");
		
		
		driver.navigate().forward();
		
		
		WebElement title3 = driver.findElement(By.xpath("//a[normalize-space()='SDET-QA']"));
		title3.equals("SDET-QA");

		System.out.println("Title3 is matched");
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		

	}

}
