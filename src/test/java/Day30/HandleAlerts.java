package Day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.edge.EdgeOptions;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		EdgeOptions options = new EdgeOptions();
		options.setPlatformName("Windows 11");

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
	
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(5000);

		//NORMAL ALERT
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		
		
		//CONFIRMATION ALERT - Ok & Cancel button
		driver.findElement(By.xpath("(//*[@data-toggle=\"tab\"])[2]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"click the button to display a confirm box \")]")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[contains(text(),\"click the button to display a confirm box \")]")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		
		
		
		//PROMPT ALERT - Input box with Ok & Cancel button
		driver.findElement(By.xpath("(//*[@data-toggle=\"tab\"])[3]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"click the button to demonstrate the prompt box \")]")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("Close popup");
		driver.switchTo().alert().accept();
		
		driver.quit();	}

}
