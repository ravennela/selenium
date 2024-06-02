package coding_5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators_dropdown {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","C:\\\\src\\\\Driver Versions\\\\chromedriver-win6405-02-24\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://libraryregtest.ccbp.tech/");
		driver.findElement(By.id("fullName")).sendKeys("karthikeya");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("contactNumber")).sendKeys("1234567890");
		driver.findElement(By.id("email")).sendKeys("123456@gmial.com");
		WebElement dropdown=driver.findElement(By.tagName("membershipType"));
		Select select=new Select(dropdown);
		select.selectByIndex(3);
		driver.findElement(By.id("fiction")).click();
		driver.findElement(By.id("agreement")).click();
		driver.findElement(By.className("submit-btn")).click();
		driver.close();

	}

}
