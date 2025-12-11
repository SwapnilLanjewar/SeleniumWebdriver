package PracticeDemo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleCode_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		String parentwindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).click();

		Set<String> childwindow = driver.getWindowHandles();

		for (String handle : childwindow) {
			System.out.println(handle);
			
			if(!parentwindow.equals(handle)) 
			{
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		System.out.println("-------------");
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	

}
