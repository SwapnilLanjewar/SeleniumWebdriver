package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Automation\\TextFiletoUpload.txt");
	}

}
