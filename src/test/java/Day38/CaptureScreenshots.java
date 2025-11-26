package Day38;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//Create interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\ScreenshotsFolder\\fullpage.png");
		sourcefile.renameTo(targetfile);
		
		
		//Screenshot of Particular section
		WebElement screenshot = driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\ScreenshotsFolder\\featureproduct.png");
		source.renameTo(target);
		
		
		
		WebElement logo = driver.findElement(By.xpath("//*[@alt=\"nopCommerce demo store\"]"));
		File sourcelogo = logo.getScreenshotAs(OutputType.FILE);
		File targetlogo = new File(System.getProperty("user.dir")+"\\ScreenshotsFolder\\logoimage.png");
		sourcelogo.renameTo(targetlogo);
		
		driver.quit();

}
}