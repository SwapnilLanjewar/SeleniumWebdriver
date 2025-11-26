package Day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands_Demo_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println(driver.getTitle());
		
		//System.out.println(driver.getPageSource());
		
		//driver.findElement(By.xpath("//*[@class='wikipedia-icon']")).click();
		
		/*
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);
		*/
		
		
		String title = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']")).getText();
		title.equals("Automation Testing Practice");
		System.out.println("Both are matched");
		
		
		boolean guiheading = driver.findElement(By.xpath("//a[normalize-space()='GUI Elements']")).isDisplayed();
		System.out.println(guiheading); 
		
		
		
		
	}

}
