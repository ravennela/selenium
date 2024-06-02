package alert_handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Codingpractice_webalert_14_3 {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://qascrtcontent.ccbp.tech/");
		WebElement view_content=driver.findElement(By.cssSelector("button.button"));
		view_content.click();
		Alert alert_1=driver.switchTo().alert();
		System.out.println(alert_1.getText());
		alert_1.sendKeys("admin");
		alert_1.accept();
		System.out.println(alert_1.getText());
		alert_1.accept();
		view_content.click();
		alert_1.sendKeys("password");
		alert_1.accept();
		System.out.println(alert_1.getText());
	}

}
