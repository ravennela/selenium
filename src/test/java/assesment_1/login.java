package assesment_1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qanxtwatch.ccbp.tech/login");
		driver.findElement(By.id("userNameInput")).sendKeys("rahul");
		driver.findElement(By.id("passwordInput")).sendKeys("rahul@2021");
		driver.findElement(By.id("loginButton")).sendKeys("loginButton");
		String expected_url="https://qanxtwatch.ccbp.tech/";
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expected_url));
		String current_url=driver.getCurrentUrl();
		String current_title=driver.getTitle();
		if (current_url.equals(expected_url)) {
			System.out.println("Logged in successfully");
			System.out.println(current_title);
		}
		else {
			System.out.println("Login Failed");
		}
		driver.findElement(By.id("desktopLogoutButton")).click();
		driver.findElement(By.id("desktopConfirmButton")).click();
		String expected_url_logout= "https://qanxtwatch.ccbp.tech/login";
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.urlToBe(expected_url_logout));
		String current_url_logout=driver.getCurrentUrl();
		String current_title_logout=driver.getTitle();
		if (current_url_logout.equals(expected_url_logout)) {
			System.out.println("Logged out successfully");
			System.out.println(current_title_logout);
		}
		else {
			System.out.println("Failed");
		}
		
	}

}
