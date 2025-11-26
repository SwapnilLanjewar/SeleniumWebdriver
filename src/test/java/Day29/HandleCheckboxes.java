package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Select the checkbox
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='sunday']"));
		System.out.println("Before selection:" + checkbox.isSelected());
		//checkbox.click();
		System.out.println("After selection:" + checkbox.isSelected());
		
		
		//Capture total number of checkbox
		List<WebElement> totalcheckboxes = driver.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Number of checkbxes:" + totalcheckboxes.size());
		
		
		//Select all checkboxes
		/* Using normal for loop
		for(int i =0; i<totalcheckboxes.size() ; i++) 
		{
			totalcheckboxes.get(i).click();
		}
		*/
		
		/*Using Enhanced for loop
		for(WebElement chckbox:totalcheckboxes) 
		{
			chckbox.click();
		}
		*/
		
		/* Select checkboxes from 4th to 7th
		for(int i=4 ; i<totalcheckboxes.size() ;i++) 
		{
			totalcheckboxes.get(i).click();
		}
		*/
		
		/*Select checkboxes from 1st to 4th
		for(int i=0 ; i<4 ;i++) 
		{
			totalcheckboxes.get(i).click();
		}
		*/
	
		for(WebElement chckbox:totalcheckboxes) 
		{
			if(chckbox.isSelected()) 
			{
				chckbox.click();
			}
			else 
			{
				chckbox.click();
			}
		}
		
		Thread.sleep(5000);
		
		for(WebElement chckbox:totalcheckboxes) 
		{
			if(chckbox.isSelected()) 
			{
				chckbox.click();
			}
			else 
			{
				chckbox.click();
			}
		}
		
		

	}

}
