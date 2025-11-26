package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemoExample1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");

		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Automation\\Text.txt");
		
		

	}

}
