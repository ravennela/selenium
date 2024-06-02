package coding_3;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login_feature_practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver()","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qaebank.ccbp.tech/ebank/login");
		driver.findElement(By.id("userIdInput")).sendKeys("142420");
		driver.findElement(By.id("pinInput")).sendKeys("231225");
		driver.findElement(By.className("login-button")).click();
		driver.manage().window().maximize();
		String expectedurl="https://qaebank.ccbp.tech/";
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expectedurl));
		String currenturl=driver.getCurrentUrl();
		if (currenturl.equals(expectedurl)) {
			System.out.println("this is passed");
		}
		else {
			System.out.println("This is failed");
		}
		
		driver.close();
		

	}

}
