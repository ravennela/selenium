
package assesment_2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assertion_dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaadduser.ccbp.tech/");
		String expcted_url="https://qaadduser.ccbp.tech/";
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expcted_url));
		driver.findElement(By.name("name")).sendKeys("sks");
		driver.findElement(By.name("email")).sendKeys("fsfsd@gmail.com");
		
		Select dropdown= new Select(driver.findElement(By.id("status")));
		dropdown.selectByVisibleText("Active");
		((WebElement) driver.findElement(By.id("genderFemale"))).click();
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		driver.quit();
		
		
		
	}

}
