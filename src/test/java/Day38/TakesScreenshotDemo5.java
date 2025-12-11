package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshotDemo5 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://carbikez.com/2025-royal-enfield-hunter-350-launched/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trgt = new File("C:\\Automation\\myworkspace\\SeleniumWebdriver\\NewFolderforTesting\\hunter.png");

		src.renameTo(trgt);

		driver.quit();

	}

	private static File File(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
