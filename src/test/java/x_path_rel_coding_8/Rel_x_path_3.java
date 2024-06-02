package x_path_rel_coding_8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rel_x_path_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver,driver,chrome","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qawikisearch.ccbp.tech/");
		driver.findElement(By.xpath("//*[@placeholder=\'Type a keyword and press Enter to search\']")).sendKeys("HTML");
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='result-item']")));
		List<WebElement>result=driver.findElements(By.xpath("//*[@class='result-item']"));
		if(result.size()>0) {
			System.out.println(result.size()+"result found");
		}
		else {
			System.out.println("result not found");
		}
		driver.close();
	}
}
