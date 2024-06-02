package x_path_coding_6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class X_path_abs_path_login_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qaebank.ccbp.tech/ebank/login");
		driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/input")).sendKeys("142420");
		driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[2]/input")).sendKeys("231225");
		driver.findElement(By.xpath("/html/body/div/div/div/div/form/button")).click();
		String expected_url= "https://qaebank.ccbp.tech/";
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expected_url));
		String current_url=driver.getCurrentUrl();
		if(expected_url.equals(current_url)) {
			System.out.println("Logged Sucessfully");
		}
		else {
			System.out.println("Failed Login");
		}
		driver.close();
				
	}

}
