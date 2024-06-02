package coding_15_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newsletter_1 {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://qanewsltrpls.ccbp.tech/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("input#name")).sendKeys("John Doe");
		WebElement button= driver.findElement(By.xpath("//*[@id='continueName']"));
		driver.findElement(By.cssSelector("button#continuePhonenum")).click();
		driver.findElement(By.xpath("//*[@placeholder='Enter your Phone Number...']")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("//button[@onclick='validateEmail()']")).click();
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("johndoe@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		WebElement sucess=driver.findElement(By.cssSelector("p#successMessage"));
		System.out.println(sucess.getText());		
		
	}

}
