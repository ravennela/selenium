package coding_4;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Linktext_partialtext {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qabloglist.ccbp.tech/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("About")).click();
		String expected_url="https://qabloglist.ccbp.tech/about";
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expected_url));
		String current_url=driver.getCurrentUrl();
		if (expected_url.equals(current_url)) {
			System.out.println("Navigated to About Page");
		}
		else {
			System.out.println("Navigation to About Page Failed");
		}
		driver.findElement(By.linkText("Contact")).click();
		String expected_url_contact ="https://qabloglist.ccbp.tech/contact";
		WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.urlToBe(expected_url_contact));
		String current_url_contact=driver.getCurrentUrl();
		if (expected_url_contact.equals(current_url_contact)) {
			System.out.println("Navigated to Contact Page");
		}
		else {
			System.out.println("Navigation to Contact Page Failed");
		}
		driver.findElement(By.linkText("Home")).click();
		String expected_url_home="https://qabloglist.ccbp.tech/";
		WebDriverWait wait2= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.urlToBe(expected_url_home));
		String current_url_home=driver.getCurrentUrl();
		if (current_url_home.equals(expected_url_home)) {
			System.out.println("Navigated to Home Page");
		}
		else {
			System.out.println("Navigation to Home Page Failed");
		}
		driver.close();
	}
}
