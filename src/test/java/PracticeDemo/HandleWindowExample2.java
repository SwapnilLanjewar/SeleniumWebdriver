package PracticeDemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowExample2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		//List<String> windowlist = new ArrayList<>(windowIDs);
		
		/*
		driver.switchTo().window(windowlist.get(0));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(windowlist.get(1));
		System.out.println(driver.getCurrentUrl());
		*/
		
		for(String winid : windowIDs) 
		{
			String title = driver.switchTo().window(winid).getTitle();
			
			if(title.equals("Automation Testing Practice")) 
			{
				driver.close();
			}
		}
		
		
		
	}

}
