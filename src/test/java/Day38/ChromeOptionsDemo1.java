package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo1 {

	public static void main(String[] args) {

		/*
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mercedes-benz.co.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", " ");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File("C:\\Automation\\myworkspace\\SeleniumWebdriver\\ScreenshotsFolder\\mercedes.png");

		sourcefile.renameTo(targetfile);

		System.out.println("Test is passed");
		*/
		
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		op.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		

	}

}
