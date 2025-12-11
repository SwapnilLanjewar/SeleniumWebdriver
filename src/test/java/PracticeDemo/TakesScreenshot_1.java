package PracticeDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshot_1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File("C:\\Automation\\myworkspace\\SeleniumWebdriver\\NewFolderforTesting\\ABC.png");

		FileUtils.copyFile(sourcefile, targetfile);

		Thread.sleep(5000);

		driver.quit();

	}

}
