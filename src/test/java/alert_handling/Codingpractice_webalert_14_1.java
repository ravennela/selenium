package alert_handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Codingpractice_webalert_14_1 {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://qastdenroll.ccbp.tech/");
		driver.findElement(By.cssSelector("input#name")).sendKeys("John");
		WebElement button= driver.findElement(By.cssSelector("button.submit-button"));
		button.click();
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.cssSelector("input#email")).sendKeys("john@gmail.com");
		button.click();
		System.out.println(alert1.getText());
		alert1.accept();
		driver.close();
	}

}
