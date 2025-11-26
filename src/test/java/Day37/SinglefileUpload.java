package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SinglefileUpload {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys("C:\\Users\\swapn\\CrossDevice\\OnePlus 11R 5G\\storage\\iLovePDF\\User guide.pdf");

		String filename = driver.findElement(By.xpath("//li[normalize-space()=\"User guide.pdf\"]")).getText();
		
		if(filename.equals("User guide.pdf")) 
		{
			System.out.println("Filename matched");
		}
		else 
		{
			System.out.println("Filename mismatch");
		}
	
	}

}
