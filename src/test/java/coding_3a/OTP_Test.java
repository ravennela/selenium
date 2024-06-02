package coding_3a;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class OTP_Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaotploginpage.ccbp.tech");
		driver.findElement(By.id("email")).sendKeys("example@gmail.com");
		driver.findElement(By.className("send-otp-btn")).click();
		driver.manage().window().maximize();
		String expected_title="OTP Verification";
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expected_title));
		String current_title=driver.getTitle();
		if(current_title .equals(expected_title)) {
			System.out.println("OTP sent successfully");
			
		}
		else {
			System.out.println("Failed");
		}
		driver.findElement(By.id("otp")).sendKeys("123456");
		driver.findElement(By.id("verifyOtpBtn")).click();
		WebDriverWait wait_1=new WebDriverWait(driver,Duration.ofSeconds(10));
		String expected_url="https://qaotploginpage.ccbp.tech/home";
		wait_1.until(ExpectedConditions.urlToBe(expected_url));
		String current_url=driver.getCurrentUrl();
		if (current_url.equals(expected_url)) {
			System.out.println("Logged in successfully");
		}
		else {
			System.out.println("Failed_2");
		}

	}

}
