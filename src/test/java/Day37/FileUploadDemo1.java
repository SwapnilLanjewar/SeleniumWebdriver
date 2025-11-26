package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		//driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys("C:\\Automation\\TextFiletoUpload.txt");
		
		/*
		String filename = driver.findElement(By.xpath("//ul[@id=\"fileList\"]")).getText();
		filename.equals("TextFiletoUpload.txt");
		System.out.println("File uploaded successfully");
		*/
		
		String file1 = "C:\\Automation\\TextFiletoUpload.txt";
		String file2 = "C:\\Automation\\NewFileToUpload.txt";
		
		driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys(file1+"\n"+file2);
	}

}
