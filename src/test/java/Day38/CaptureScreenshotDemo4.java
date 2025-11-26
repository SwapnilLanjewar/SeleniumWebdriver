package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshotDemo4 {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		
		File targetfile = new File(System.getProperty("user.dir")+"\\ScreenshotsFolder\\newimage.png");
		
		sourcefile.renameTo(targetfile);
		
		
	}

}
