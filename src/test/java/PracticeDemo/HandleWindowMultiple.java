package PracticeDemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowMultiple {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		// Parent window
		String parentWindow = driver.getWindowHandle();

		// Open multiple child windows
		driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Blogger']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Wikipedia']")).click();

		// Get all window handles
		Set<String> handles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(handles);

		// Switch to second tab (index 1)
		driver.switchTo().window(windowList.get(1));
		System.out.println("Second tab title: " + driver.getTitle());
		// 👉 Perform your action here
		driver.close();

		// Switch to third tab (index 2)
		driver.switchTo().window(windowList.get(2));
		System.out.println("Third tab title: " + driver.getTitle());
		// 👉 Perform your action here
		driver.close();

		// Switch back to parent tab (index 0)
		driver.switchTo().window(windowList.get(0));
		System.out.println("Back to parent tab: " + driver.getTitle());

		driver.quit();
	}
}