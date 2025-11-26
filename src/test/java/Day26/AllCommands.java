package Day26;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCommands {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Testname");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("998877665544332211");
		driver.findElement(By.xpath("//*[@id=\"textarea\"]")).sendKeys("XYZ Street");

		System.out.println("The title of page is:" + driver.getTitle());

		// System.out.println("The pagesource is: " + driver.getPageSource());

		System.out.println("URL is:" + driver.getCurrentUrl());

		String windowid = driver.getWindowHandle();
		System.out.println("Window id is:" + windowid);

		/*
		driver.findElement(By.xpath("//a[contains(text(),\"Blogger\")]")).click();
		Set<String> windowids = driver.getWindowHandles();
		System.out.println("Window id of new browser is:" + windowids);
		driver.close();
		*/
		
		driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
		System.out.println("Male option is selected:" + driver.findElement(By.xpath("//*[@id=\"male\"]")).isSelected());
		System.out.println("Male option is enabled:" + driver.findElement(By.xpath("//*[@id=\"male\"]")).isEnabled());
		
		driver.findElement(By.xpath("//input[@value=\"sunday\"]")).click();
		

	
	}

}
