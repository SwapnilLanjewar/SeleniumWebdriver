package Day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:" + links.size());
		
		for(WebElement linkElement : links) 
		{
			String hrefattvalue = linkElement.getAttribute("href");
			
			if(hrefattvalue == null || hrefattvalue.isEmpty()) 
			{
				System.out.println("href attribute value is null or empty, so not possible to check");
				continue;
			}
			try 
			{
			URL linkurl = new URL(hrefattvalue);
			HttpURLConnection connlinkURL = (HttpURLConnection)linkurl.openConnection();
			HttpURLConnection conn = null;
			conn.connect();
		
			if(conn.getResponseCode()>=400) 
			{
				System.out.println("Broken link");
				}
			else 
			{
				System.out.println("Not broken link");
			}
			}
			
			catch(Exception e) 
			{
				
			}
		}
		
		
		
	}

}
