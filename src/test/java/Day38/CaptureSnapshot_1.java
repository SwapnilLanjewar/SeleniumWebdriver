package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureSnapshot_1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		TakesScreenshot js = (TakesScreenshot)driver;
		
		File sourcefile = js.getScreenshotAs(OutputType.FILE);
		
		File targetfile = new File(System.getProperty("user.dir")+ "\\ScreenshotsFolder\\imageone.png");
		
		sourcefile.renameTo(targetfile);
		

	}

}
