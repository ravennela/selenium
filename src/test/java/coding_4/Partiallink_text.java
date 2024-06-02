package coding_4;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Partiallink_text {
	public static void main(String[]args) {
		System.getProperty("webdriver.chrome","C:\\\\src\\\\Driver Versions\\\\chromedriver-win6405-02-24\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qacompany.ccbp.tech/");
		driver.findElement(By.linkText("Home")).click();
		String expected_url="https://qacompany.ccbp.tech/";
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expected_url));
		String current_url="https://qacompany.ccbp.tech/";
		if (current_url.equals(expected_url)) {
			System.out.println("test passed");
		}
		else {
			System.out.println("testfailed");
		}
		driver.findElement(By.partialLinkText("Abou")).click();
		String expected_url_about="https://qacompany.ccbp.tech/";
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.urlToBe(expected_url_about));
		String current_url_about=driver.getCurrentUrl();
		if (current_url_about.equals(expected_url_about)) {
			System.out.println("test passed");
			}
			else {
				System.out.println("testfailed");
			}	
		driver.findElement(By.partialLinkText("Serv")).click();
		driver.close();
	}

}
