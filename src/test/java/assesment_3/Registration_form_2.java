package assesment_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration_form_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaregform.ccbp.tech");
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("John");
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Doe");
		driver.findElement(By.xpath("/html/body/div/div/div/form/button")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='success-image']")));
		System.out.println("Print Sucessfully");
		driver.findElement(By.xpath("/html/body/div/div/div/button"));
		driver.close();
	}
	
}
