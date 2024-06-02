package x_path_coding_7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class X_path_login_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaotploginpage.ccbp.tech");
		driver.findElement(By.xpath("/html/body/div/div/input")).sendKeys("example@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div/button")).click();
		String Expected_title="OTP Verification";
		String Current_title=driver.getTitle();
		if (Current_title.equals(Expected_title)) {
			System.out.println("OTP sent successfully");
		}
		else {
			System.out.println("OTP not Send");
		}
		driver.findElement(By.xpath("/html/body/div/div/input")).sendKeys("123456");	
		driver.findElement(By.xpath("/html/body/div/div/button")).click();
		String Expected_url="https://qaotploginpage.ccbp.tech/home";
		WebDriverWait wait2= new WebDriverWait (driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.urlToBe(Expected_url));
		String Current_url=driver.getCurrentUrl();
		if (Expected_url.equals(Current_url)) {
			System.out.println("Logged in successfully");
		}
		else {
			System.out.println("OTP not Send");
		}
		

	}

}
