package PracticeDemo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleProgram {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.navigate().to("https://testautomationpractice.blogspot.com/");

		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Blogger']")).click();

		Set<String> windowIDs = driver.getWindowHandles();

		for (String winid : windowIDs) {
			String title = driver.switchTo().window(winid).getTitle();

			if (title.equals("merrymoonmary Stock Image and Video Portfolio - iStock")) {
				driver.findElement(By.xpath(
						"//input[@placeholder='Search millions of images and videos free of AI-generated content']"))
						.sendKeys("Apple");
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}

			else if (title.equals("Blogger.com - Create a unique and beautiful blog easily.")) {
				String communitytext = driver.findElement(By.xpath("//h3[normalize-space()='Community']")).getText();
				communitytext.equals("Community");
				System.out.println(driver.getCurrentUrl());
				driver.close();

			}

			driver.switchTo().window(parentwindow);

		}

	}
}
