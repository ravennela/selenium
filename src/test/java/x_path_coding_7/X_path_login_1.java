package x_path_coding_7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class X_path_login_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaloginpage.ccbp.tech/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/form/input[1]")).sendKeys("rahul");
		driver.findElement(By.xpath("/html/body/div/form/input[2]")).sendKeys("rahul@2023");
		driver.findElement(By.xpath("/html/body/div/form/button")).click();
		String expected_url= "https://qaloginpage.ccbp.tech/home";
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expected_url));
		String current_url=driver.getCurrentUrl();
		if(expected_url.equals(current_url))	{
			System.out.println("Logged in successfully");
		}
		else {
			System.out.println("Logged unsucessfully");
		}
		driver.close();
		
	}

}
