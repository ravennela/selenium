package assesment_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkshopEnrollemnet {
	public static WebDriver driver;
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://qaworkshopenrl.ccbp.tech/");
	//Wait<WebDriver>wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(500));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	driver.findElement(By.xpath("//div[@class='inner-input']//child::input[@id='name']")).sendKeys("George");
	driver.findElement(By.cssSelector("button#continueName")).click();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("george@gmail.com");
	driver.findElement(By.cssSelector("button#continueEmail")).click();
	driver.findElement(By.cssSelector("input#react")).click();
	//List<WebElement>slot_list=driver.findElements(By.xpath("//select[@id='slot']"));
	Select objselect=new Select(driver.findElement(By.xpath("//select[@id='slot']")));
	objselect.selectByValue("eleven");
	
	 
	
	

	}

}
