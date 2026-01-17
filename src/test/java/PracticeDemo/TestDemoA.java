package PracticeDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemoA {

	WebDriver driver;
	
	@BeforeTest
	void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	
	@Test
	void test() 
	{
		TestMainA tp = new TestMainA(driver);
		tp.setname("John");
		System.out.println("Name is passed");
		tp.setemail("xyz@gmail.com");
		System.out.println("Email is passed");
	}
	
	@AfterTest
	void teardown() 
	{
		driver.quit();
	}
}
