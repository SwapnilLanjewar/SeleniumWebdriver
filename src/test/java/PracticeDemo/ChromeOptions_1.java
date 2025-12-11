package PracticeDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op = new ChromeOptions();
		//op.addArguments("--headless=new");
		op.addArguments("--incognito");
		op.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://expired.badssl.com/");
		
		Thread.sleep(8000);
		
		System.out.println("test is passed");
		
		driver.quit();
		
		

	}

}
