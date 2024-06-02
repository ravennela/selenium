package coding_3a;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logintest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qaloginpage.ccbp.tech/");
		driver.findElement(By.id("username")).sendKeys("rahul");
		driver.findElement(By.id("password")).sendKeys("rahul@2023");
		driver.findElement(By.className("login-button")).click();
		driver.manage().window().maximize();
		String expected_url="https://qaloginpage.ccbp.tech/";
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expected_url));
		String currenturl=driver.getCurrentUrl();
		if (currenturl.equals(expected_url)) {
			System.out.println("Logged in successfully");
		}
		else {
			System.out.println("This is failed");
		}
		driver.close();	
	}

}
