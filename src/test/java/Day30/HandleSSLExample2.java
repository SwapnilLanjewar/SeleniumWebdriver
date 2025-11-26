package Day30;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSLExample2 {

	public static void main(String[] args) {
	
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--incognito");
		
		WebDriver driver  = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println("Testcase is passed and SSL handled successfully");
		
		
		

	}

}
