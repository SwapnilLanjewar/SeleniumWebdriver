package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesSnapshotDemo_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.youtube.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trgt = new File("C:\\Automation\\myworkspace\\SeleniumWebdriver\\NewFolderforTesting\\uniquelatest.png");
		src.renameTo(trgt);
		
		Thread.sleep(5000);
		System.out.println("Snapshot captured");
		driver.quit();
	}

}
