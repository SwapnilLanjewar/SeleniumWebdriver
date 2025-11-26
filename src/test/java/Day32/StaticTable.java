package Day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Find total number of rows in table
	    int rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println("Number of rows: "+ rows);
		
		//Find total number of columns in table
	    int columns = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
	    System.out.println("Number of columns: "+ columns);
	    
	    //Capture data from table
	    String bookname = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[1]")).getText();
	    System.out.println("Book name is: "+ bookname);
	    
	    //Read data from all the rows and columns
	    /*
	    for(int r = 2; r<=rows; r++)
	    {
	    	for(int c = 1; c<=columns ; c++) 
	    	{
	    		String value = driver.findElement(By.xpath("//*[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
	    		System.out.print(value+ "\t");
	    	}
	    	System.out.println();
	    }
	    */
	    
	    
	    
	}

}
