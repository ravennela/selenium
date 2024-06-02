package x_path_coding_6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class X_path_abs_login_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaebank.ccbp.tech/ebank/login");
		driver.get("https://qaebank.ccbp.tech/ebank/login");
		driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/input")).sendKeys("142420");
		driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[2]/input")).sendKeys("231225");
		driver.findElement(By.xpath("/html/body/div/div/div/div/form/button")).click();
		String Expected_url="https://qaebank.ccbp.tech/";
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(Expected_url));
		String Current_url=driver.getCurrentUrl();
		if (Expected_url.equals(Current_url)) {
			System.out.println("Logged in successfully");
			System.out.println(Current_url);
		}
		else {
			System.out.println("Un-successfully");
		}
		driver.findElement(By.xpath("/html/body/div/div/div[1]/button")).click();
		String Expected_url1="https://qaebank.ccbp.tech/ebank/login";
		WebDriverWait wait2= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.urlToBe(Expected_url1));
		String  Current_url1= driver.getCurrentUrl();
		if(Expected_url1.equals(Current_url1)) {
			System.out.println("Logged out successfully");
		}
		else {
			System.out.println("Not Sucessfully");
		}
		driver.close();
		
		
	}

}
