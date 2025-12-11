package PracticeDemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenLink_1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			String url = link.getAttribute("href");

			if (url == null || url.isEmpty()) {
				System.out.println("URL is Empty");
				continue;
			}

			try {
				HttpURLConnection huc = (HttpURLConnection) (new URL(url).openConnection());
				huc.connect();

				if (huc.getResponseCode() >= 400) {
					System.out.println(url + "This is broken");
				} else {
					System.out.println(url + "This is not broken");
				}

			}

			catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
