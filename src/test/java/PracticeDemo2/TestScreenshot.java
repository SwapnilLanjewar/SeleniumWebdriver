package PracticeDemo2;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestScreenshot {

	public static void main(String[] args) {
		
		
		ChromeOptions op = new ChromeOptions();
		//op.addArguments("--headless=new");
		op.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File("C:\\Automation\\myworkspace\\SeleniumWebdriver\\NewFolderforTesting\\imagetwo.png");
		
		sourcefile.renameTo(targetfile);
		driver.quit();
	}

}
